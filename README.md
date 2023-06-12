# Minesweeper

Classic minesweeper in java.

## Getting Started

### Prerequisites

Java version between 8 and 19.

### Installing and running

Download the repository and unzip it.

Run the project

```
./gradlew run
```

The game runs with a default of an 8x8 board with 16 mines. To change this, run the project with command line arguments.

```
./gradlew run --args="-m 10 -r 10 -c 15"
```

or

```
./gradlew run --args="--mines 10 --rows 10 --cols 15"
```

## Mechanics

Left click a sqaure to reveal it. The game is over if it's a mine. The number in the square indicates how many adjacent (including diagonal) squares have mines. If there are no mines, no number is shown. Right click a square to flag it as having a mine. When all non-mine squares are revealed, the game is over.

## Built With

* [Amazon Coretto 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html) - distribution of OpenJDK used
* [Gradle 8](https://gradle.org/) - build automation tool