package minesweeper;

import java.util.ArrayList;
import java.awt.Color;
import libs.javalib.worldimages.*;

// to represent one cell in the minesweeper game

class Cell {

  ArrayList<Cell> neighbors;
  boolean mine;
  boolean revealed;
  boolean flagged;
  int adjacentMines;

  public Cell() {
    this.neighbors = new ArrayList<Cell>();
    this.mine = false;
    this.revealed = false;
    this.flagged = false;
    this.adjacentMines = 0;
  }

  // draws a game cell
  public WorldImage draw() {   

    // cell not revealed
    if (!this.revealed) {
      WorldImage cellImg = new FrameImage(new RectangleImage(30, 30, OutlineMode.SOLID,
          new Color(55, 135, 176)));
      WorldImage flag = new BesideAlignImage(AlignModeY.TOP,
          new RectangleImage(2, 20, OutlineMode.SOLID, Color.BLACK),
          new RectangleImage(15, 10, OutlineMode.SOLID, Color.RED));
      WorldImage flaggedCellImg = new OverlayImage(flag, cellImg);
      // if flagged, return flagged cell, else return base image
      return (this.flagged) ? flaggedCellImg : cellImg;
    }

    // cell revealed, but no mine
    else if (!this.mine) {
      Color numColor;

      // determines color for cell overlay
      switch (this.numAdjacentMines()) {
        case 1: 
          numColor = new Color(80, 150, 200);
          break;
        case 2:
          numColor = new Color(50, 200, 150);
          break;
        case 3:
          numColor = new Color(250, 40, 40);
          break;
        case 4:
          numColor = new Color(200, 40, 40);
          break;
        case 5:
          numColor = new Color(150, 40, 40);
          break;
        case 6:
          numColor = new Color(100, 40, 40);
          break;
        case 7:
          numColor = new Color(50, 40, 40);
          break;
        case 8:
          numColor = new Color(0, 40, 40);
          break;
        default: 
          numColor = new Color(128, 128, 128);
          break;
      }

      WorldImage numImg = new TextImage(Integer.toString(this.adjacentMines), 20, numColor);
      return new FrameImage(new OverlayImage(numImg,
          new RectangleImage(30, 30, OutlineMode.SOLID, new Color(128, 128, 128))));
    }

    // cell revealed and has mine
    else {
      WorldImage mine = new CircleImage(5, OutlineMode.SOLID, Color.BLACK);
      return new FrameImage(new OverlayImage(mine,
          new RectangleImage(30, 30, OutlineMode.SOLID, new Color(130, 40, 40))));
    }
  }

  // counts the number of mines in adjacent cells
  int numAdjacentMines() {
    int count = 0;
    for (Cell c : this.neighbors) {
      if (c.mine) {
        count++;
      }
    }
    return count;
  }

  // EFFECT: updates flag of this cell
  public void updateFlag() {
    if (this.flagged) {
      this.flagged = false;
    }
    else {
      this.flagged = true;
    }
  }

  // "reveals" a game cell if not clicked, fill effects if not surrounded by mines
  public void reveal() {

    // make sure its not already revealed
    if (!this.revealed) {

      // reveal cell if not revealed
      this.revealed = true;

      // flood fill if no adjacent mines
      if (this.adjacentMines == 0) {
        for (Cell c : this.neighbors) {
          c.reveal();
        }
      }
    }
  }
}