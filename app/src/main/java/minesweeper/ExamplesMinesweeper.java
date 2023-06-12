// // libraries

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Random;
// import tester.*;
// import java.awt.Color;
// import libs.javalib.impworld.*;
// import libs.javalib.worldimages.*;

// // examples and tests

// class ExamplesMinesweeper {

//   // Minesweeper example (4 rows, 3 cols, 4 mines)
//   Minesweeper fixedGame;
//   // and its associated fields
//   ArrayList<Cell> gameCells;
//   Random fixedRand;

//   // Cell examples
//   // so that the came looks like:
//   // and cells without mines are "\", cells with mine are "/"
//   // [ 1\][ 2\][ 3\][ 4/]
//   // [ 5\][ 6\][ 7\][ 8/]
//   // [ 9\][10/][11/][12\]
//   // [13\][14\][15\][16/]
//   // [17\][18\][19\][20\]
//   Cell cell1;
//   Cell cell2;
//   Cell cell3;
//   Cell cell4;
//   Cell cell5;
//   Cell cell6;
//   Cell cell7;
//   Cell cell8;
//   Cell cell9;
//   Cell cell10;
//   Cell cell11;
//   Cell cell12;
//   Cell cell13;
//   Cell cell14;
//   Cell cell15;
//   Cell cell16;
//   Cell cell17;
//   Cell cell18;
//   Cell cell19;
//   Cell cell20;
//   // and their associated lists of neighbors
//   ArrayList<Cell> nbrs1;
//   ArrayList<Cell> nbrs2;
//   ArrayList<Cell> nbrs3;
//   ArrayList<Cell> nbrs4;
//   ArrayList<Cell> nbrs5;
//   ArrayList<Cell> nbrs6;
//   ArrayList<Cell> nbrs7;
//   ArrayList<Cell> nbrs8;
//   ArrayList<Cell> nbrs9;
//   ArrayList<Cell> nbrs10;
//   ArrayList<Cell> nbrs11;
//   ArrayList<Cell> nbrs12;
//   ArrayList<Cell> nbrs13;
//   ArrayList<Cell> nbrs14;
//   ArrayList<Cell> nbrs15;
//   ArrayList<Cell> nbrs16;
//   ArrayList<Cell> nbrs17;
//   ArrayList<Cell> nbrs18;
//   ArrayList<Cell> nbrs19;
//   ArrayList<Cell> nbrs20;

//   // Cell(s) for draw() tests
//   Cell cellDrawMine;
//   Cell cellDraw0;
//   Cell cellDraw1;
//   Cell cellDraw2;
//   Cell cellDraw3;
//   Cell cellDraw4;
//   Cell cellDraw5;
//   Cell cellDraw6;
//   Cell cellDraw7;
//   Cell cellDraw8;

//   // WorldImage(s) for draw() tests
//   WorldImage cellImg;
//   WorldImage flag;
//   WorldImage flaggedCellImg;
//   WorldImage mine;
//   WorldImage mineImg;
//   WorldImage numImg0;
//   WorldImage revealedCellImg0;
//   WorldImage numImg1;
//   WorldImage revealedCellImg1;
//   WorldImage numImg2;
//   WorldImage revealedCellImg2;
//   WorldImage numImg3;
//   WorldImage revealedCellImg3;
//   WorldImage numImg4;
//   WorldImage revealedCellImg4;
//   WorldImage numImg5;
//   WorldImage revealedCellImg5;
//   WorldImage numImg6;
//   WorldImage revealedCellImg6;
//   WorldImage numImg7;
//   WorldImage revealedCellImg7;
//   WorldImage numImg8;
//   WorldImage revealedCellImg8;



//   // resets data
//   void initData() {
//     // sets the rand to a fixed random seed
//     this.fixedRand = new Random(5);
//     // initializes the game w/ fixedRand for testing
//     this.fixedGame = new Minesweeper(5, 5, 4, this.fixedRand);
//     // sets all cells and neighbors in this.fixedGame for testing
//     this.cell1 = this.fixedGame.cells.get(0);
//     this.cell2 = this.fixedGame.cells.get(1);
//     this.cell3 = this.fixedGame.cells.get(2);
//     this.cell4 = this.fixedGame.cells.get(3);
//     this.cell5 = this.fixedGame.cells.get(4);
//     this.cell6 = this.fixedGame.cells.get(5);
//     this.cell7 = this.fixedGame.cells.get(6);
//     this.cell8 = this.fixedGame.cells.get(7);
//     this.cell9 = this.fixedGame.cells.get(8);
//     this.cell10 = this.fixedGame.cells.get(9);
//     this.cell11 = this.fixedGame.cells.get(10);
//     this.cell12 = this.fixedGame.cells.get(11);
//     this.cell13 = this.fixedGame.cells.get(12);
//     this.cell14 = this.fixedGame.cells.get(13);
//     this.cell15 = this.fixedGame.cells.get(14);
//     this.cell16 = this.fixedGame.cells.get(15);
//     this.cell17 = this.fixedGame.cells.get(16);
//     this.cell18 = this.fixedGame.cells.get(17);
//     this.cell19 = this.fixedGame.cells.get(18);
//     this.cell20 = this.fixedGame.cells.get(19);
//     // sets all neighbors in this.fixedGame for testing
//     this.nbrs1 = this.cell1.neighbors;
//     this.nbrs2 = this.cell2.neighbors;
//     this.nbrs3 = this.cell3.neighbors;
//     this.nbrs4 = this.cell4.neighbors;
//     this.nbrs5 = this.cell5.neighbors;
//     this.nbrs6 = this.cell6.neighbors;
//     this.nbrs7 = this.cell7.neighbors;
//     this.nbrs8 = this.cell8.neighbors;
//     this.nbrs9 = this.cell9.neighbors;
//     this.nbrs10 = this.cell10.neighbors;
//     this.nbrs11 = this.cell11.neighbors;
//     this.nbrs12 = this.cell12.neighbors;
//     this.nbrs13 = this.cell13.neighbors;
//     this.nbrs14 = this.cell14.neighbors;
//     this.nbrs15 = this.cell15.neighbors;
//     this.nbrs16 = this.cell16.neighbors;
//     this.nbrs17 = this.cell17.neighbors;
//     this.nbrs18 = this.cell18.neighbors;
//     this.nbrs19 = this.cell19.neighbors;
//     this.nbrs20 = this.cell20.neighbors;
//     // sets the game cells in an ArrayList for testing
//     this.gameCells = new ArrayList<Cell>(Arrays.asList(
//         this.cell1, this.cell2, this.cell3, this.cell4, 
//         this.cell5, this.cell6, this.cell7, this.cell8, 
//         this.cell9, this.cell10, this.cell11, this.cell2, 
//         this.cell13, this.cell14, this.cell15, this.cell16, 
//         this.cell17, this.cell18, this.cell19, this.cell20));

//     // Cell(s) for draw() tests
//     this.cellDrawMine = new Cell();
//     this.cellDrawMine.mine = true;
//     this.cellDrawMine.reveal();
//     this.cellDraw0 = new Cell();
//     this.cellDraw0.reveal();
//     this.cellDraw1 = new Cell();
//     this.cellDraw1.adjacentMines = 1;
//     this.cellDraw1.reveal();
//     this.cellDraw1.neighbors = new ArrayList<Cell>(Arrays.asList(
//         this.cellDrawMine));
//     this.cellDraw2 = new Cell();
//     this.cellDraw2.adjacentMines = 2;
//     this.cellDraw2.reveal();
//     this.cellDraw2.neighbors = new ArrayList<Cell>(Arrays.asList(
//         this.cellDrawMine, this.cellDrawMine));
//     this.cellDraw3 = new Cell();
//     this.cellDraw3.adjacentMines = 3;
//     this.cellDraw3.reveal();
//     this.cellDraw3.neighbors = new ArrayList<Cell>(Arrays.asList(
//         this.cellDrawMine, this.cellDrawMine, this.cellDrawMine));
//     this.cellDraw4 = new Cell();
//     this.cellDraw4.adjacentMines = 4;
//     this.cellDraw4.reveal();
//     this.cellDraw4.neighbors = new ArrayList<Cell>(Arrays.asList(
//         this.cellDrawMine, this.cellDrawMine, this.cellDrawMine, 
//         this.cellDrawMine));
//     this.cellDraw5 = new Cell();
//     this.cellDraw5.adjacentMines = 5;
//     this.cellDraw5.reveal();
//     this.cellDraw5.neighbors = new ArrayList<Cell>(Arrays.asList(
//         this.cellDrawMine, this.cellDrawMine, this.cellDrawMine, 
//         this.cellDrawMine, this.cellDrawMine));
//     this.cellDraw6 = new Cell();
//     this.cellDraw6.adjacentMines = 6;
//     this.cellDraw6.reveal();
//     this.cellDraw6.neighbors = new ArrayList<Cell>(Arrays.asList(
//         this.cellDrawMine, this.cellDrawMine, this.cellDrawMine, 
//         this.cellDrawMine, this.cellDrawMine, this.cellDrawMine));
//     this.cellDraw7 = new Cell();
//     this.cellDraw7.adjacentMines = 7;
//     this.cellDraw7.reveal();
//     this.cellDraw7.neighbors = new ArrayList<Cell>(Arrays.asList(
//         this.cellDrawMine, this.cellDrawMine, this.cellDrawMine, 
//         this.cellDrawMine, this.cellDrawMine, this.cellDrawMine, 
//         this.cellDrawMine));
//     this.cellDraw8 = new Cell();
//     this.cellDraw8.adjacentMines = 8;
//     this.cellDraw8.reveal();
//     this.cellDraw8.neighbors = new ArrayList<Cell>(Arrays.asList(
//         this.cellDrawMine, this.cellDrawMine, this.cellDrawMine, 
//         this.cellDrawMine, this.cellDrawMine, this.cellDrawMine, 
//         this.cellDrawMine, this.cellDrawMine));

//     // WorldImage(s) for draw() tests
//     this.cellImg = new FrameImage(new RectangleImage(30, 30, OutlineMode.SOLID,
//         new Color(55, 135, 176)));
//     this.flag = new BesideAlignImage(AlignModeY.TOP,
//         new RectangleImage(2, 20, OutlineMode.SOLID, Color.BLACK),
//         new RectangleImage(15, 10, OutlineMode.SOLID, Color.RED));
//     this.flaggedCellImg = new OverlayImage(flag, cellImg);
//     this.mine = new CircleImage(5, OutlineMode.SOLID, Color.BLACK);
//     this.mineImg = new FrameImage(new OverlayImage(mine,
//         new RectangleImage(30, 30, OutlineMode.SOLID, new Color(130, 40, 40))));
//     this.numImg0 = new TextImage("0", 20, new Color(128, 128, 128));
//     this.revealedCellImg0 = new FrameImage(new OverlayImage(this.numImg0,
//         new RectangleImage(30, 30, OutlineMode.SOLID, new Color(128, 128, 128))));
//     this.numImg1 = new TextImage("1", 20, new Color(80, 150, 200));
//     this.revealedCellImg1 = new FrameImage(new OverlayImage(this.numImg1,
//         new RectangleImage(30, 30, OutlineMode.SOLID, new Color(128, 128, 128))));
//     this.numImg2 = new TextImage("2", 20, new Color(50, 200, 150));
//     this.revealedCellImg2 = new FrameImage(new OverlayImage(this.numImg2,
//         new RectangleImage(30, 30, OutlineMode.SOLID, new Color(128, 128, 128))));
//     this.numImg3 = new TextImage("3", 20, new Color(250, 40, 40));
//     this.revealedCellImg3 = new FrameImage(new OverlayImage(this.numImg3,
//         new RectangleImage(30, 30, OutlineMode.SOLID, new Color(128, 128, 128))));
//     this.numImg4 = new TextImage("4", 20, new Color(200, 40, 40));
//     this.revealedCellImg4 = new FrameImage(new OverlayImage(this.numImg4,
//         new RectangleImage(30, 30, OutlineMode.SOLID, new Color(128, 128, 128))));
//     this.numImg5 = new TextImage("5", 20, new Color(150, 40, 40));
//     this.revealedCellImg5 = new FrameImage(new OverlayImage(this.numImg5,
//         new RectangleImage(30, 30, OutlineMode.SOLID, new Color(128, 128, 128))));
//     this.numImg6 = new TextImage("6", 20, new Color(100, 40, 40));
//     this.revealedCellImg6 = new FrameImage(new OverlayImage(this.numImg6,
//         new RectangleImage(30, 30, OutlineMode.SOLID, new Color(128, 128, 128))));
//     this.numImg7 = new TextImage("7", 20, new Color(50, 40, 40));
//     this.revealedCellImg7 = new FrameImage(new OverlayImage(this.numImg7,
//         new RectangleImage(30, 30, OutlineMode.SOLID, new Color(128, 128, 128))));
//     this.numImg8 = new TextImage("8", 20, new Color(0, 40, 40));
//     this.revealedCellImg8 = new FrameImage(new OverlayImage(this.numImg8,
//         new RectangleImage(30, 30, OutlineMode.SOLID, new Color(128, 128, 128))));

//   }


//   void testFixedGame(Tester t) {
//     initData();
//     this.fixedGame.bigBang(
//         this.fixedGame.numCols * 30,  this.fixedGame.numRows * 30);
//   }

//   /* This is the fixed game with rand = new Random(5)


//   // runs minesweeper game with the correct specifications from the assignment
//   void testGame(Tester t) {
//     Minesweeper m = new Minesweeper(99, 30, 16);
//     m.bigBang(m.numCols * 30, m.numRows * 30);
//   }

//    */

//   // tests the draw() method on the Cell class
//   void testDrawCell(Tester t) {
//     initData(); // reset data

//     // not revealed cells
//     t.checkExpect(this.cell1.draw(), this.cellImg); // no adj mines
//     t.checkExpect(this.cell4.draw(), this.cellImg); // has adj mines
//     t.checkExpect(this.cell7.draw(), this.cellImg); // is mine
//     // mutate to flag cells
//     this.cell1.flagged = true;
//     this.cell4.flagged = true;
//     this.cell7.flagged = true;
//     // revealed cells
//     t.checkExpect(this.cell1.draw(), this.flaggedCellImg); // no adj mines
//     t.checkExpect(this.cell4.draw(), this.flaggedCellImg); // has adj mines
//     t.checkExpect(this.cell7.draw(), this.flaggedCellImg); // is mine

//     initData(); // reset data

//     // revealed cells
//     // to test the drawing of a mine
//     t.checkExpect(this.cellDrawMine.draw(), this.mineImg);
//     // to test the color/presence of the text
//     t.checkExpect(this.cellDraw0.draw(), this.revealedCellImg0); // value: 0
//     t.checkExpect(this.cellDraw1.draw(), this.revealedCellImg1); // value: 1
//     t.checkExpect(this.cellDraw2.draw(), this.revealedCellImg2); // value: 2
//     t.checkExpect(this.cellDraw3.draw(), this.revealedCellImg3); // value: 3
//     t.checkExpect(this.cellDraw4.draw(), this.revealedCellImg4); // value: 4
//     t.checkExpect(this.cellDraw5.draw(), this.revealedCellImg5); // value: 5
//     t.checkExpect(this.cellDraw6.draw(), this.revealedCellImg6); // value: 6
//     t.checkExpect(this.cellDraw7.draw(), this.revealedCellImg7); // value: 7
//     t.checkExpect(this.cellDraw8.draw(), this.revealedCellImg8); // value: 8
//   }

//   // tests the numAdjacentMines() method on the Cell class
//   void testNumAdjacentMines(Tester t) {
//     initData(); // reset data

//     t.checkExpect(this.cellDraw0.numAdjacentMines(), 0);
//     t.checkExpect(this.cellDraw1.numAdjacentMines(), 1);
//     t.checkExpect(this.cellDraw2.numAdjacentMines(), 2);
//     t.checkExpect(this.cellDraw3.numAdjacentMines(), 3);
//     t.checkExpect(this.cellDraw4.numAdjacentMines(), 4);
//     t.checkExpect(this.cellDraw5.numAdjacentMines(), 5);
//     t.checkExpect(this.cellDraw6.numAdjacentMines(), 6);
//     t.checkExpect(this.cellDraw7.numAdjacentMines(), 7);
//     t.checkExpect(this.cellDraw8.numAdjacentMines(), 8);
//     t.checkExpect(this.cellDrawMine.numAdjacentMines(), 0);
//   }

//   // tests the updateFlag() method of the Cell class
//   void testUpdateFlag(Tester t) {
//     initData(); // reset data

//     // not flagged cells
//     t.checkExpect(this.cell1.flagged, false); // no adj mines
//     t.checkExpect(this.cell4.flagged, false); // has adj mines
//     t.checkExpect(this.cell7.flagged, false); // is mine
//     // mutate to flag cells
//     this.cell1.updateFlag();
//     this.cell4.updateFlag();
//     this.cell7.updateFlag();
//     // flagged cells
//     t.checkExpect(this.cell1.flagged, true); // no adj mines
//     t.checkExpect(this.cell4.flagged, true); // has adj mines
//     t.checkExpect(this.cell7.flagged, true); // is mine
//     // mutate to un-flag cells
//     this.cell1.updateFlag();
//     this.cell4.updateFlag();
//     this.cell7.updateFlag();
//     // not flagged cells
//     t.checkExpect(this.cell1.flagged, false); // no adj mines
//     t.checkExpect(this.cell4.flagged, false); // has adj mines
//     t.checkExpect(this.cell7.flagged, false); // is mine
//   }

//   // tests the updateFlag() method of the Cell class
//   void testReveal(Tester t) {
//     initData(); // reset data

//     // not revealed cells
//     t.checkExpect(this.cell1.revealed, false); // no adj mines
//     t.checkExpect(this.cell4.revealed, false); // has adj mines
//     t.checkExpect(this.cell7.revealed, false); // is mine
//     // mutate to reveal cells
//     this.cell1.reveal();
//     this.cell4.reveal();
//     this.cell7.reveal();
//     // revealed cells
//     t.checkExpect(this.cell1.revealed, true); // no adj mines
//     t.checkExpect(this.cell4.revealed, true); // has adj mines
//     t.checkExpect(this.cell7.revealed, true); // is mine
//     // try mutate to ensure revealed cells stay revealed
//     this.cell1.reveal();
//     this.cell4.reveal();
//     this.cell7.reveal();
//     // still revealed cells
//     t.checkExpect(this.cell1.revealed, true); // no adj mines
//     t.checkExpect(this.cell4.revealed, true); // has adj mines
//     t.checkExpect(this.cell7.revealed, true); // is mine
//   }

//   // tests the setNeighbors() method on the Minesweeper class
//   void testSetNeighbors(Tester t) {
//     initData(); // reset data

//     // mutate the cells to be an empty array
//     this.fixedGame.cells = new ArrayList<Cell>();

//     // fill the board with cells
//     for (int i = 0; i < this.fixedGame.numRows * this.fixedGame.numCols; i++) {
//       this.fixedGame.cells.add(new Cell());
//     }

//     ArrayList<Cell> gC = this.fixedGame.cells;
//     // ensure that no cell has neighbors 
//     t.checkExpect(gC.get(0).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(1).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(2).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(3).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(4).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(5).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(6).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(7).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(8).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(9).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(10).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(11).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(12).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(13).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(14).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(15).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(16).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(17).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(18).neighbors, new ArrayList<Cell>());
//     t.checkExpect(gC.get(19).neighbors, new ArrayList<Cell>());

//     // call setNeighbors()
//     this.fixedGame.setNeighbors();

//     // test all cases to see if the neighbors are correct
//     // - top left corner
//     t.checkExpect(gC.get(0).neighbors.contains(gC.get(0)), false);
//     t.checkExpect(gC.get(0).neighbors.contains(gC.get(1)), true);
//     t.checkExpect(gC.get(0).neighbors.contains(gC.get(4)), true);
//     t.checkExpect(gC.get(0).neighbors.contains(gC.get(5)), true);
//     // - top center
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(1)), false);
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(0)), true);
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(2)), true);
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(4)), true);
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(5)), true);
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(6)), true);
//     // - top right corner
//     t.checkExpect(gC.get(3).neighbors.contains(gC.get(3)), false);
//     t.checkExpect(gC.get(3).neighbors.contains(gC.get(2)), true);
//     t.checkExpect(gC.get(3).neighbors.contains(gC.get(6)), true);
//     t.checkExpect(gC.get(3).neighbors.contains(gC.get(7)), true);
//     // - left side
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(4)), false);
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(0)), true);
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(1)), true);
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(8)), true);
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(9)), true);
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(5)), true);
//     // - center
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(5)), false);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(1)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(0)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(2)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(9)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(8)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(10)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(4)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(6)), true);
//     // - right side
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(7)), false);
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(3)), true);
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(2)), true);
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(11)), true);
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(10)), true);
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(6)), true);
//     // - bottom left corner
//     t.checkExpect(gC.get(16).neighbors.contains(gC.get(16)), false);
//     t.checkExpect(gC.get(16).neighbors.contains(gC.get(12)), true);
//     t.checkExpect(gC.get(16).neighbors.contains(gC.get(13)), true);
//     t.checkExpect(gC.get(16).neighbors.contains(gC.get(17)), true);
//     // - bottom center
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(17)), false);
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(13)), true);
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(12)), true);
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(14)), true);
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(16)), true);
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(18)), true);
//     // - bottom right corner
//     t.checkExpect(gC.get(19).neighbors.contains(gC.get(19)), false);
//     t.checkExpect(gC.get(19).neighbors.contains(gC.get(14)), true);
//     t.checkExpect(gC.get(19).neighbors.contains(gC.get(15)), true);
//     t.checkExpect(gC.get(19).neighbors.contains(gC.get(18)), true);
//   }

//   // tests the setMines() method on the Minesweeper class
//   void testSetMines(Tester t) {
//     initData(); // reset data

//     // mutate the cells to be an empty array
//     this.fixedGame.cells = new ArrayList<Cell>();

//     // fill the board with cells
//     for (int i = 0; i < this.fixedGame.numRows * this.fixedGame.numCols; i++) {
//       this.fixedGame.cells.add(new Cell());
//     }

//     ArrayList<Cell> gC = this.fixedGame.cells;
//     // ensure that no cell is a mine 
//     t.checkExpect(gC.get(0).mine, false);
//     t.checkExpect(gC.get(1).mine, false);
//     t.checkExpect(gC.get(2).mine, false);
//     t.checkExpect(gC.get(3).mine, false);
//     t.checkExpect(gC.get(4).mine, false);
//     t.checkExpect(gC.get(5).mine, false);
//     t.checkExpect(gC.get(6).mine, false);
//     t.checkExpect(gC.get(7).mine, false);
//     t.checkExpect(gC.get(8).mine, false);
//     t.checkExpect(gC.get(9).mine, false);
//     t.checkExpect(gC.get(10).mine, false);
//     t.checkExpect(gC.get(11).mine, false);
//     t.checkExpect(gC.get(12).mine, false);
//     t.checkExpect(gC.get(13).mine, false);
//     t.checkExpect(gC.get(14).mine, false);
//     t.checkExpect(gC.get(15).mine, false);
//     t.checkExpect(gC.get(16).mine, false);
//     t.checkExpect(gC.get(17).mine, false);
//     t.checkExpect(gC.get(18).mine, false);
//     t.checkExpect(gC.get(19).mine, false);

//     // call setMines()
//     this.fixedGame.setMines();

//     // ensure that only the correct cells are mines
//     t.checkExpect(gC.get(0).mine, false);
//     t.checkExpect(gC.get(1).mine, false);
//     t.checkExpect(gC.get(2).mine, false);
//     t.checkExpect(gC.get(3).mine, false);
//     t.checkExpect(gC.get(4).mine, false);
//     t.checkExpect(gC.get(5).mine, true);
//     t.checkExpect(gC.get(6).mine, true);
//     t.checkExpect(gC.get(7).mine, false);
//     t.checkExpect(gC.get(8).mine, true);
//     t.checkExpect(gC.get(9).mine, false);
//     t.checkExpect(gC.get(10).mine, false);
//     t.checkExpect(gC.get(11).mine, false);
//     t.checkExpect(gC.get(12).mine, false);
//     t.checkExpect(gC.get(13).mine, false);
//     t.checkExpect(gC.get(14).mine, false);
//     t.checkExpect(gC.get(15).mine, true);
//     t.checkExpect(gC.get(16).mine, false);
//     t.checkExpect(gC.get(17).mine, false);
//     t.checkExpect(gC.get(18).mine, false);
//     t.checkExpect(gC.get(19).mine, true);
//   }

//   // tests the updateCellMineCount() method on the Minesweeper class
//   void testUpdateCellMineCount(Tester t) {
//     initData(); // reset data

//     // mutate the cells to be an empty array
//     this.fixedGame.cells = new ArrayList<Cell>();

//     // fill the board with cells
//     for (int i = 0; i < this.fixedGame.numRows * this.fixedGame.numCols; i++) {
//       this.fixedGame.cells.add(new Cell());
//     }

//     // call setMines() to set the mines in the correct places
//     this.fixedGame.setMines();

//     // call setNeighbors() so cells can see their adjacent cells
//     this.fixedGame.setNeighbors();

//     ArrayList<Cell> gC = this.fixedGame.cells;
//     // ensure that no cell has an adjacentMines count (all are 0) 
//     t.checkExpect(gC.get(0).adjacentMines, 0);
//     t.checkExpect(gC.get(1).adjacentMines, 0);
//     t.checkExpect(gC.get(2).adjacentMines, 0);
//     t.checkExpect(gC.get(3).adjacentMines, 0);
//     t.checkExpect(gC.get(4).adjacentMines, 0);
//     t.checkExpect(gC.get(5).adjacentMines, 0);
//     t.checkExpect(gC.get(6).adjacentMines, 0);
//     t.checkExpect(gC.get(7).adjacentMines, 0);
//     t.checkExpect(gC.get(8).adjacentMines, 0);
//     t.checkExpect(gC.get(9).adjacentMines, 0);
//     t.checkExpect(gC.get(10).adjacentMines, 0);
//     t.checkExpect(gC.get(11).adjacentMines, 0);
//     t.checkExpect(gC.get(12).adjacentMines, 0);
//     t.checkExpect(gC.get(13).adjacentMines, 0);
//     t.checkExpect(gC.get(14).adjacentMines, 0);
//     t.checkExpect(gC.get(15).adjacentMines, 0);
//     t.checkExpect(gC.get(16).adjacentMines, 0);
//     t.checkExpect(gC.get(17).adjacentMines, 0);
//     t.checkExpect(gC.get(18).adjacentMines, 0);
//     t.checkExpect(gC.get(19).adjacentMines, 0);

//     // call updateCellMineCount()
//     this.fixedGame.updateCellMineCount();

//     // ensure that all cells have the correct count
//     t.checkExpect(gC.get(0).adjacentMines, 1);
//     t.checkExpect(gC.get(1).adjacentMines, 2);
//     t.checkExpect(gC.get(2).adjacentMines, 2);
//     t.checkExpect(gC.get(3).adjacentMines, 1);
//     t.checkExpect(gC.get(4).adjacentMines, 2);
//     t.checkExpect(gC.get(5).adjacentMines, 2);
//     t.checkExpect(gC.get(6).adjacentMines, 1);
//     t.checkExpect(gC.get(7).adjacentMines, 1);
//     t.checkExpect(gC.get(8).adjacentMines, 1);
//     t.checkExpect(gC.get(9).adjacentMines, 3);
//     t.checkExpect(gC.get(10).adjacentMines, 3);
//     t.checkExpect(gC.get(11).adjacentMines, 2);
//     t.checkExpect(gC.get(12).adjacentMines, 1);
//     t.checkExpect(gC.get(13).adjacentMines, 1);
//     t.checkExpect(gC.get(14).adjacentMines, 2);
//     t.checkExpect(gC.get(15).adjacentMines, 1);
//     t.checkExpect(gC.get(16).adjacentMines, 0);
//     t.checkExpect(gC.get(17).adjacentMines, 0);
//     t.checkExpect(gC.get(18).adjacentMines, 2);
//     t.checkExpect(gC.get(19).adjacentMines, 1);
//   }

//   // tests the initMinesweeper() method on the Minesweeper class
//   void testInitMinesweeper(Tester t) {
//     initData(); // reset data

//     // mutate the cells to be an empty array
//     this.fixedGame.cells = new ArrayList<Cell>();

//     ArrayList<Cell> gC = this.fixedGame.cells;
//     // ensure that no cells exist in this Minesweeper
//     t.checkExpect(this.fixedGame.cells.size(), 0);

//     // call updateCellMineCount()
//     this.fixedGame.initMinesweeper();

//     // test all cases to see if the neighbors are correct
//     // - top left corner
//     t.checkExpect(gC.get(0).neighbors.contains(gC.get(0)), false);
//     t.checkExpect(gC.get(0).neighbors.contains(gC.get(1)), true);
//     t.checkExpect(gC.get(0).neighbors.contains(gC.get(4)), true);
//     t.checkExpect(gC.get(0).neighbors.contains(gC.get(5)), true);
//     // - top center
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(1)), false);
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(0)), true);
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(2)), true);
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(4)), true);
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(5)), true);
//     t.checkExpect(gC.get(1).neighbors.contains(gC.get(6)), true);
//     // - top right corner
//     t.checkExpect(gC.get(3).neighbors.contains(gC.get(3)), false);
//     t.checkExpect(gC.get(3).neighbors.contains(gC.get(2)), true);
//     t.checkExpect(gC.get(3).neighbors.contains(gC.get(6)), true);
//     t.checkExpect(gC.get(3).neighbors.contains(gC.get(7)), true);
//     // - left side
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(4)), false);
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(0)), true);
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(1)), true);
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(8)), true);
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(9)), true);
//     t.checkExpect(gC.get(4).neighbors.contains(gC.get(5)), true);
//     // - center
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(5)), false);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(1)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(0)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(2)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(9)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(8)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(10)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(4)), true);
//     t.checkExpect(gC.get(5).neighbors.contains(gC.get(6)), true);
//     // - right side
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(7)), false);
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(3)), true);
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(2)), true);
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(11)), true);
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(10)), true);
//     t.checkExpect(gC.get(7).neighbors.contains(gC.get(6)), true);
//     // - bottom left corner
//     t.checkExpect(gC.get(16).neighbors.contains(gC.get(16)), false);
//     t.checkExpect(gC.get(16).neighbors.contains(gC.get(12)), true);
//     t.checkExpect(gC.get(16).neighbors.contains(gC.get(13)), true);
//     t.checkExpect(gC.get(16).neighbors.contains(gC.get(17)), true);
//     // - bottom center
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(17)), false);
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(13)), true);
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(12)), true);
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(14)), true);
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(16)), true);
//     t.checkExpect(gC.get(17).neighbors.contains(gC.get(18)), true);
//     // - bottom right corner
//     t.checkExpect(gC.get(19).neighbors.contains(gC.get(19)), false);
//     t.checkExpect(gC.get(19).neighbors.contains(gC.get(14)), true);
//     t.checkExpect(gC.get(19).neighbors.contains(gC.get(15)), true);
//     t.checkExpect(gC.get(19).neighbors.contains(gC.get(18)), true);

//     // ensure that only the correct cells are mines
//     t.checkExpect(gC.get(0).mine, false);
//     t.checkExpect(gC.get(1).mine, false);
//     t.checkExpect(gC.get(2).mine, false);
//     t.checkExpect(gC.get(3).mine, false);
//     t.checkExpect(gC.get(4).mine, false);
//     t.checkExpect(gC.get(5).mine, true);
//     t.checkExpect(gC.get(6).mine, true);
//     t.checkExpect(gC.get(7).mine, false);
//     t.checkExpect(gC.get(8).mine, true);
//     t.checkExpect(gC.get(9).mine, false);
//     t.checkExpect(gC.get(10).mine, false);
//     t.checkExpect(gC.get(11).mine, false);
//     t.checkExpect(gC.get(12).mine, false);
//     t.checkExpect(gC.get(13).mine, false);
//     t.checkExpect(gC.get(14).mine, false);
//     t.checkExpect(gC.get(15).mine, true);
//     t.checkExpect(gC.get(16).mine, false);
//     t.checkExpect(gC.get(17).mine, false);
//     t.checkExpect(gC.get(18).mine, false);
//     t.checkExpect(gC.get(19).mine, true);

//     // ensure that all cells have the correct count
//     t.checkExpect(gC.get(0).adjacentMines, 1);
//     t.checkExpect(gC.get(1).adjacentMines, 2);
//     t.checkExpect(gC.get(2).adjacentMines, 2);
//     t.checkExpect(gC.get(3).adjacentMines, 1);
//     t.checkExpect(gC.get(4).adjacentMines, 2);
//     t.checkExpect(gC.get(5).adjacentMines, 2);
//     t.checkExpect(gC.get(6).adjacentMines, 1);
//     t.checkExpect(gC.get(7).adjacentMines, 1);
//     t.checkExpect(gC.get(8).adjacentMines, 1);
//     t.checkExpect(gC.get(9).adjacentMines, 3);
//     t.checkExpect(gC.get(10).adjacentMines, 3);
//     t.checkExpect(gC.get(11).adjacentMines, 2);
//     t.checkExpect(gC.get(12).adjacentMines, 1);
//     t.checkExpect(gC.get(13).adjacentMines, 1);
//     t.checkExpect(gC.get(14).adjacentMines, 2);
//     t.checkExpect(gC.get(15).adjacentMines, 1);
//     t.checkExpect(gC.get(16).adjacentMines, 0);
//     t.checkExpect(gC.get(17).adjacentMines, 0);
//     t.checkExpect(gC.get(18).adjacentMines, 2);
//     t.checkExpect(gC.get(19).adjacentMines, 1);
//   }

//   // tests the makeScene() method on the Minesweeper class
//   void testMakeScene(Tester t) {
//     initData(); // reset data

//     // store the created scene as a constant
//     WorldScene funcScene = this.fixedGame.makeScene();
    
//     // create the correct scene by adding all cells in this.fixedGame
//     // to an empty WorldScene in the correct position
//     WorldScene correctScene = this.fixedGame.getEmptyScene();
//     for (Cell c : this.fixedGame.cells) {
//       int cIndex = this.fixedGame.cells.indexOf(c);
//       correctScene.placeImageXY(c.draw(),
//           30 * (cIndex % 4) + 15, 30 * (cIndex / 4) + 15);
//     }

//     // ensure the scenes are the same
//     t.checkExpect(funcScene, correctScene);
//   }

//   // tests the revealCells() method on the Minesweeper class
//   void testRevealCells(Tester t) {
//     initData(); // reset data

//     ArrayList<Cell> gC = this.fixedGame.cells;

//     // ensure that all cells are not revealed
//     t.checkExpect(gC.get(0).revealed, false);
//     t.checkExpect(gC.get(1).revealed, false);
//     t.checkExpect(gC.get(2).revealed, false);
//     t.checkExpect(gC.get(3).revealed, false);
//     t.checkExpect(gC.get(4).revealed, false);
//     t.checkExpect(gC.get(5).revealed, false);
//     t.checkExpect(gC.get(6).revealed, false);
//     t.checkExpect(gC.get(7).revealed, false);
//     t.checkExpect(gC.get(8).revealed, false);
//     t.checkExpect(gC.get(9).revealed, false);
//     t.checkExpect(gC.get(10).revealed, false);
//     t.checkExpect(gC.get(11).revealed, false);
//     t.checkExpect(gC.get(12).revealed, false);
//     t.checkExpect(gC.get(13).revealed, false);
//     t.checkExpect(gC.get(14).revealed, false);
//     t.checkExpect(gC.get(15).revealed, false);
//     t.checkExpect(gC.get(16).revealed, false);
//     t.checkExpect(gC.get(17).revealed, false);
//     t.checkExpect(gC.get(18).revealed, false);
//     t.checkExpect(gC.get(19).revealed, false);

//     // reveal two cells and check
//     this.fixedGame.cells.get(6).reveal();  // a mine
//     this.fixedGame.cells.get(16).reveal(); // not a mine
//     t.checkExpect(gC.get(6).revealed, true);
//     t.checkExpect(gC.get(16).revealed, true);

//     // mutate to reveal all Cell(s) in this.fixedGame
//     this.fixedGame.revealCells();

//     // ensure that all cells have been revealed, and previously 
//     // revealed cells stay revealed
//     t.checkExpect(gC.get(0).revealed, true);
//     t.checkExpect(gC.get(1).revealed, true);
//     t.checkExpect(gC.get(2).revealed, true);
//     t.checkExpect(gC.get(3).revealed, true);
//     t.checkExpect(gC.get(4).revealed, true);
//     t.checkExpect(gC.get(5).revealed, true);
//     t.checkExpect(gC.get(6).revealed, true);
//     t.checkExpect(gC.get(7).revealed, true);
//     t.checkExpect(gC.get(8).revealed, true);
//     t.checkExpect(gC.get(9).revealed, true);
//     t.checkExpect(gC.get(10).revealed, true);
//     t.checkExpect(gC.get(11).revealed, true);
//     t.checkExpect(gC.get(12).revealed, true);
//     t.checkExpect(gC.get(13).revealed, true);
//     t.checkExpect(gC.get(14).revealed, true);
//     t.checkExpect(gC.get(15).revealed, true);
//     t.checkExpect(gC.get(16).revealed, true);
//     t.checkExpect(gC.get(17).revealed, true);
//     t.checkExpect(gC.get(18).revealed, true);
//     t.checkExpect(gC.get(19).revealed, true);
//   }

//   // tests the lastScene(String s) method on the Minesweeper class
//   void testLastScene(Tester t) {
//     initData(); // reset data
    
//     // store the result of lastScene as constants
//     WorldScene funcWin = this.fixedGame.lastScene("You Win");
//     initData(); // reset data
//     WorldScene funcLoss = this.fixedGame.lastScene("You Lose");
//     initData(); // reset data

//     // create the correct lastScene() result
//     WorldScene correctScene = this.fixedGame.getEmptyScene();
//     for (Cell c : this.fixedGame.cells) {
//       int cIndex = this.fixedGame.cells.indexOf(c);
//       correctScene.placeImageXY(c.draw(),
//           30 * (cIndex % 4) + 15, 30 * (cIndex / 4) + 15);
//     }
//     WorldScene correctWin = correctScene;
//     WorldScene correctLoss = correctScene;
//     WorldImage winText = new OverlayImage(new TextImage("You Win", 25, Color.WHITE),
//         new RectangleImage(180, 60, OutlineMode.SOLID, new Color(0, 0, 0, 120)));
//     WorldImage lossText = new OverlayImage(new TextImage("You Lose", 25, Color.WHITE),
//         new RectangleImage(180, 60, OutlineMode.SOLID, new Color(0, 0, 0, 120)));
//     correctWin.placeImageXY(winText, 60, 75);
//     correctLoss.placeImageXY(lossText, 60, 75);
    
//     // ensure the scene made by the method is the same as the constant
//     t.checkExpect(funcWin, correctWin);
//     t.checkExpect(funcLoss, correctLoss);
//   }

//   // tests the findCell(Posn pos) method on the Minesweeper class
//   void testFindCell(Tester t) {
//     initData(); // reset data

//     ArrayList<Cell> gC = this.fixedGame.cells;

//     // check that the correct cell is retrieved for all cells
//     t.checkExpect(this.fixedGame.findCell(new Posn(0, 0)), gC.get(0));
//     t.checkExpect(this.fixedGame.findCell(new Posn(30, 0)), gC.get(1));
//     t.checkExpect(this.fixedGame.findCell(new Posn(60, 0)), gC.get(2));
//     t.checkExpect(this.fixedGame.findCell(new Posn(90, 0)), gC.get(3));
//     t.checkExpect(this.fixedGame.findCell(new Posn(0, 30)), gC.get(4));
//     t.checkExpect(this.fixedGame.findCell(new Posn(30, 30)), gC.get(5));
//     t.checkExpect(this.fixedGame.findCell(new Posn(60, 30)), gC.get(6));
//     t.checkExpect(this.fixedGame.findCell(new Posn(90, 30)), gC.get(7));
//     t.checkExpect(this.fixedGame.findCell(new Posn(0, 60)), gC.get(8));
//     t.checkExpect(this.fixedGame.findCell(new Posn(30, 60)), gC.get(9));
//     t.checkExpect(this.fixedGame.findCell(new Posn(60, 60)), gC.get(10));
//     t.checkExpect(this.fixedGame.findCell(new Posn(90, 60)), gC.get(11));
//     t.checkExpect(this.fixedGame.findCell(new Posn(0, 90)), gC.get(12));
//     t.checkExpect(this.fixedGame.findCell(new Posn(30, 90)), gC.get(13));
//     t.checkExpect(this.fixedGame.findCell(new Posn(60, 90)), gC.get(14));
//     t.checkExpect(this.fixedGame.findCell(new Posn(90, 90)), gC.get(15));
//     t.checkExpect(this.fixedGame.findCell(new Posn(0, 120)), gC.get(16));
//     t.checkExpect(this.fixedGame.findCell(new Posn(30, 120)), gC.get(17));
//     t.checkExpect(this.fixedGame.findCell(new Posn(60, 120)), gC.get(18));
//     t.checkExpect(this.fixedGame.findCell(new Posn(90, 120)), gC.get(19));
//   }

//   // tests the countRevealed() method on the Minesweeper class
//   void testCountRevealed(Tester t) {
//     initData(); // reset data

//     ArrayList<Cell> gC = this.fixedGame.cells;

//     // ensure no cells are revealed and that the count is 0
//     t.checkExpect(gC.get(0).revealed, false);
//     t.checkExpect(gC.get(1).revealed, false);
//     t.checkExpect(gC.get(2).revealed, false);
//     t.checkExpect(gC.get(3).revealed, false);
//     t.checkExpect(gC.get(4).revealed, false);
//     t.checkExpect(gC.get(5).revealed, false);
//     t.checkExpect(gC.get(6).revealed, false);
//     t.checkExpect(gC.get(7).revealed, false);
//     t.checkExpect(gC.get(8).revealed, false);
//     t.checkExpect(gC.get(9).revealed, false);
//     t.checkExpect(gC.get(10).revealed, false);
//     t.checkExpect(gC.get(11).revealed, false);
//     t.checkExpect(gC.get(12).revealed, false);
//     t.checkExpect(gC.get(13).revealed, false);
//     t.checkExpect(gC.get(14).revealed, false);
//     t.checkExpect(gC.get(15).revealed, false);
//     t.checkExpect(gC.get(16).revealed, false);
//     t.checkExpect(gC.get(17).revealed, false);
//     t.checkExpect(gC.get(18).revealed, false);
//     t.checkExpect(gC.get(19).revealed, false);
//     t.checkExpect(this.fixedGame.countRevealed(), 0);

//     // reveal 1 cell, and check that the count is 1
//     this.fixedGame.cells.get(13).reveal();
//     t.checkExpect(this.fixedGame.countRevealed(), 1);

//     // reveal 3 cells and check that the count is 9
//     this.fixedGame.cells.get(1).reveal(); // reveals adjacent cells due to flood-fill
//     this.fixedGame.cells.get(14).reveal();
//     this.fixedGame.cells.get(7).reveal();
//     t.checkExpect(this.fixedGame.countRevealed(), 9);

//     // reveal all cells and check that the count is 20
//     this.fixedGame.revealCells();
//     t.checkExpect(this.fixedGame.countRevealed(), 20);
//   }

//   // tests the onMouseClicked(Posn pos, String button) method on the Minesweeper class
//   void testOnMouseClicked(Tester t) {
//     initData(); // reset data

//     // ensure no cells are flagged nor revealed
//     t.checkExpect(this.fixedGame.cells.get(0).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(1).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(2).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(3).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(4).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(5).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(6).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(7).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(8).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(9).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(10).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(11).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(12).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(13).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(14).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(15).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(16).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(17).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(18).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(19).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(0).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(1).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(2).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(3).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(4).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(5).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(6).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(7).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(8).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(9).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(10).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(11).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(12).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(13).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(14).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(15).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(16).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(17).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(18).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(19).flagged, false);

//     // simulate a right click on the Cell(s) 1, 4, and 7
//     // check that these cells are flagged but not revealed
//     this.fixedGame.onMouseClicked(new Posn(49, 17), "RightButton");  // no adj mines
//     t.checkExpect(this.fixedGame.cells.get(1).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(1).flagged, true);
//     this.fixedGame.onMouseClicked(new Posn(3, 34), "RightButton");   // has adj mines
//     t.checkExpect(this.fixedGame.cells.get(4).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(4).flagged, true);
//     this.fixedGame.onMouseClicked(new Posn(111, 54), "RightButton"); // is mine
//     t.checkExpect(this.fixedGame.cells.get(7).revealed, false);
//     t.checkExpect(this.fixedGame.cells.get(7).flagged, true);

//     initData(); // reset data

//     // simulate a left click on the Cell(s) 1, and 4
//     // ensure that these cells are flagged and not revealed (and flood-fill for cell 1 works)
//     this.fixedGame.onMouseClicked(new Posn(3, 34), "LeftButton");   // has adj mines
//     t.checkExpect(this.fixedGame.cells.get(4).revealed, true);
//     t.checkExpect(this.fixedGame.cells.get(4).flagged, false);
//     this.fixedGame.onMouseClicked(new Posn(49, 17), "LeftButton");  // no adj mines
//     t.checkExpect(this.fixedGame.cells.get(1).revealed, true);
//     t.checkExpect(this.fixedGame.cells.get(1).flagged, false);
//     t.checkExpect(this.fixedGame.cells.get(0).revealed, true);
//     t.checkExpect(this.fixedGame.cells.get(2).revealed, true);
//     t.checkExpect(this.fixedGame.cells.get(4).revealed, true);
//     t.checkExpect(this.fixedGame.cells.get(5).revealed, true);
//     t.checkExpect(this.fixedGame.cells.get(6).revealed, true);

//     // simulate a left click on the Cell(s) 1, and 4 again
//     // ensure that nothing changes
//     this.fixedGame.onMouseClicked(new Posn(49, 17), "LeftButton");  // no adj mines
//     t.checkExpect(this.fixedGame.cells.get(1).revealed, true);
//     t.checkExpect(this.fixedGame.cells.get(1).flagged, false);
//     this.fixedGame.onMouseClicked(new Posn(3, 34), "LeftButton");   // has adj mines
//     t.checkExpect(this.fixedGame.cells.get(4).revealed, true);
//     t.checkExpect(this.fixedGame.cells.get(4).flagged, false);

//     initData(); // reset data

//     // simulate a right click on Cell 7 (a mine)
//     t.checkExpect(this.fixedGame.numRevealed, 0); // check that no Cell(s) have been revealed
//     this.fixedGame.onMouseClicked(new Posn(102, 34), "LeftButton");
//     // ensure the mine is revealed and that makeScene() creates the lastScene("You Lose")
//     t.checkExpect(this.fixedGame.cells.get(7).revealed, true);
//     t.checkExpect(this.fixedGame.lastScene("You Lose"), this.fixedGame.makeScene());

//     initData(); // reset data

//     // reveal all empty cells except Cell 8 then simulate a right click on 
//     // Cell 8 (the last unrevealed empty cell)
//     this.fixedGame.cells.get(0).reveal();
//     this.fixedGame.cells.get(1).reveal();
//     this.fixedGame.cells.get(2).reveal();
//     this.fixedGame.cells.get(3).reveal();
//     this.fixedGame.cells.get(4).reveal();
//     this.fixedGame.cells.get(5).reveal();
//     this.fixedGame.cells.get(6).reveal();
//     this.fixedGame.cells.get(11).reveal();
//     this.fixedGame.cells.get(12).reveal();
//     this.fixedGame.cells.get(13).reveal();
//     this.fixedGame.cells.get(14).reveal();
//     this.fixedGame.cells.get(16).reveal();
//     this.fixedGame.cells.get(17).reveal();
//     this.fixedGame.cells.get(18).reveal();
//     this.fixedGame.cells.get(19).reveal();
//     this.fixedGame.onMouseClicked(new Posn(4, 63), "LeftButton");
//     // ensure the cell is revealed and that makeScene() creates the lastScene("You Win")
//     t.checkExpect(this.fixedGame.cells.get(8).revealed, true);
//     t.checkExpect(this.fixedGame.lastScene("You Win"), this.fixedGame.makeScene());
//   }
// }

