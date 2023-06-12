package minesweeper;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class App {

    @Parameter(names = {"--mines", "-m"})
    int numMines = 16;

    @Parameter(names = {"--rows", "-r"})
    int numRows = 8;

    @Parameter(names = {"--cols", "-c"})
    int numCols = 8;

    public static void main(String... args) {
        App app = new App();
        JCommander.newBuilder().addObject(app).build().parse(args);
        app.run();
    }

    public void run() {
        Minesweeper minesweeper = new Minesweeper(numMines, numRows, numCols);
        minesweeper.bigBang(numCols * 30, numRows * 30);
    }
}
