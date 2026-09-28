# TP 1 - Beginning of the project

During this TP, you will start to use the jpacman-framework, an implementation of the famous Pacman game, in Java. The following exercises will ask you to implement a few tests. The idea is to make you discover the codebase, and to remind you of JUnit and AssertJ framework for unit testing.

Here is a link for AssertJ documentation: https://assertj.github.io/doc/#assertj-core-assertions-guide
and for JUnit : https://docs.junit.org/5.0.1/api/org/junit/jupiter/api/Assertions.html.

## Exercice 1
Open `board.DirectionTest` and implement the 4 empty unit tests to check the directions when moving north, south, east and west.

## Exercice 2
Open the `level.ScoreTest` class and implement the empty tests.
1. `testInitialPoints()` asserts that a fresh `Score` starts at 0 points.
2. `testAddPoints()` asserts that adding points is correctly reflected in the total.
3. `testAddPointsTwice()` asserts that adding points twice accumulates both amounts.
4. `testAddNegativePoints()` asserts that adding negative points is correctly reflected in the total.

## Exercice 3
Open the `board.OccupantTest` class and implement the 3 empty tests:
1. `noStartSquare()` test asserts that a unit has no square to start with, i.e., a unit "has no square" at the beginning.
2. `testOccupy()` test verifies that the unit indeed has the target square as its base after occupation. In other words, if a unit is occupied by a(ny) basic square, one should contain the other.
3. `testReoccupy()` test verifies that the unit indeed has the target square as its base after double occupation.

## Exercice 4
Open the `board.SquareNeighbourTest` class and implement the 3 empty tests. This exercise focuses on the `link()` and `getSquareAt()` methods of the `Square` class, which are used internally by `BoardFactory` (see `board.BoardFactoryTest` for inspiration).
1. `testNoNeighbourByDefault()` asserts that a square has no neighbour in a given direction (e.g., `Direction.NORTH`) before it has been linked to one.
2. `testLinkedNeighbour()` asserts that after calling `square.link(neighbour, direction)`, `square.getSquareAt(direction)` indeed returns `neighbour`.
3. `testLinkIsOneWay()` asserts that linking `square` to `neighbour` does **not** automatically link `neighbour` back to `square` (i.e., `neighbour.getSquareAt(direction)` should still be `null`).

## Exercice 5
Open the `board.BoardTest` class and implement the following tests :
1. `verifyWidth()` verifies that the board's width is **equal to** its max width.
2. `verifyHeight()` verifies that the board's height is **equal to** its max height.
3. `testSquareAt` test asserts that X Y coordinates are indeed on the board.