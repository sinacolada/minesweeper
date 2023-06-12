package minesweeper;

import java.util.ArrayList;
import java.util.Random;
import libs.javalib.impworld.*;
import java.awt.Color;
import libs.javalib.worldimages.*;

// represents the game World
class Minesweeper extends World {

  ArrayList<Cell> cells;
  int numMines;
  int numRows;
  int numCols;
  int numRevealed;
  Random rand = new Random();

  // constructor for testing where fixed Random seed can be given
  public Minesweeper(int numMines, int numRows, int numCols, Random rand) {
    this.cells = new ArrayList<Cell>();
    this.numMines = numMines;
    this.numRows = numRows;
    this.numCols = numCols;
    this.numRevealed = 0;
    this.rand = rand;
    this.initMinesweeper();
  }

  public Minesweeper(int numMines, int numRows, int numCols) {
    this.cells = new ArrayList<Cell>();
    this.numMines = numMines;
    this.numRows = numRows;
    this.numCols = numCols;
    this.numRevealed = 0;
    this.initMinesweeper();
  }

  // EFFECT: sets neighbors of each cell in this game
  public void setNeighbors() {
    for (int i = 0; i < this.numRows * this.numCols; i++) {

      // local constants
      ArrayList<Cell> n = this.cells.get(i).neighbors;
      int row = i / this.numCols;
      int col = i % this.numCols;

      // consider edge cases:
      // cell not on top row
      if (row != 0) {
        n.add(this.cells.get(i - this.numCols));
        if (col != 0) {
          n.add(this.cells.get(i - this.numCols - 1));
        }
        if (col != this.numCols - 1) {
          n.add(this.cells.get(i - this.numCols + 1));
        }
      }

      // cell not on bottom row
      if (row != this.numRows - 1) {
        n.add(this.cells.get(i + this.numCols));
        if (col != 0) {
          n.add(this.cells.get(i + this.numCols - 1));
        }
        if (col != this.numCols - 1) {
          n.add(this.cells.get(i + this.numCols + 1));
        }
      }

      // cell not on leftmost column
      if (col != 0) {
        n.add(this.cells.get(i - 1));
      }

      // cell not on rightmost column
      if (col != this.numCols - 1) {
        n.add(this.cells.get(i + 1));
      }
    }
  }

  // EFFECT: sets mines of this game
  public void setMines() {
    // creates copy of arraylist w/ same object references
    ArrayList<Cell> cellsCopy = new ArrayList<Cell>();

    for (int i = 0; i < this.numRows * this.numCols; i++) {
      cellsCopy.add(this.cells.get(i));
    }

    // randomly removes cells and sets mines
    int mineCount = this.numMines;

    while (mineCount > 0) {
      Cell randCell = cellsCopy.remove(rand.nextInt(cellsCopy.size()));
      randCell.mine = true;
      mineCount--;
    } 
  }

  // EFFECT: updates adjacentMines field of all cells
  public void updateCellMineCount() {
    for (Cell c : this.cells) {
      c.adjacentMines = c .numAdjacentMines();
    }
  }

  // EFFECT: initializes minesweeper game
  public void initMinesweeper() {

    // adds all cells 
    for (int i = 0; i < this.numRows * this.numCols; i++) {
      this.cells.add(new Cell());
    }

    this.setNeighbors();
    this.setMines();
    this.updateCellMineCount();
  }

  // draws the minesweeper game
  public WorldScene makeScene() {

    WorldScene scene = this.getEmptyScene();

    for (int i = 0; i < this.numRows * this.numCols; i++) {
      scene.placeImageXY(this.cells.get(i).draw(),
          30 * (i % this.numCols) + 15, 30 * (i / this.numCols) + 15);
    }

    return scene;
  }

  // EFFECT : reveals all unclicked cells
  public void revealCells() {
    for (Cell c : this.cells) {
      c.reveal();
    }
  }

  // scene shown when the world ends
  public WorldScene lastScene(String msg) {
    this.revealCells();
    WorldScene finalReveal = this.makeScene();
    WorldImage txtImg = new OverlayImage(new TextImage(msg, 25, Color.WHITE),
        new RectangleImage(180, 60, OutlineMode.SOLID, new Color(0, 0, 0, 120)));
    finalReveal.placeImageXY(txtImg, this.numCols * 15, this.numRows * 15);
    return finalReveal;
  }

  // finds corresponding cell when given its position
  public Cell findCell(Posn pos) {
    int row = pos.y / 30;
    int col = pos.x / 30;
    return this.cells.get(row * this.numCols + col);
  }

  // returns amount of revealed cells in the cell list
  public int countRevealed() {

    int revealed = 0;

    for (Cell c : this.cells) {
      if (c.revealed) {
        revealed++;
      }
    }
    return revealed;
  }

  // handles mouse click user actions
  // EFFECT: reveals cell user clicked on, updates fields accordingly
  public void onMouseClicked(Posn pos, String button) {

    Cell cellClicked = this.findCell(pos);

    if (button.equals("RightButton")) {
      cellClicked.updateFlag();
    }

    else if (button.equals("LeftButton")) {
      if (!cellClicked.revealed) {
        int preReveal = this.countRevealed();
        cellClicked.reveal();
        int postReveal = this.countRevealed();
        this.numRevealed += (postReveal - preReveal);
        if (this.numRevealed == this.numRows * this.numCols - this.numMines) {
          this.endOfWorld("You Win!");
        }
        if (cellClicked.mine) {
          this.endOfWorld("You Lose!");
        }
      }
    }

    else {
      return;
    }
  }
}