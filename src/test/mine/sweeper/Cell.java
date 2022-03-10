package test.mine.sweeper;

import java.util.ArrayList;
import java.util.Arrays;

public class Cell {

                                        // the Cells Position

    private final int xPos;
    private final int yPos;

                                        // the Cells Properties
    private final boolean isMine;
    private boolean isFlagged;
    private boolean isShown;

    private String symbol;
    private String value;

                                        // Cell surroundings

    private final Cell[][] myBoard;
    private final ArrayList<Cell> surroundingCells = new ArrayList<>();

    public Cell(int x, int y, boolean isMine, Cell[][] board) {

        this.isMine = isMine;
        this.isFlagged = false;
        this.isShown = false;

        this.myBoard = board;

        this.xPos = x;
        this.yPos = y;
        symbol = "*";

        if (this.isMine) {
            value = "#";
        }
    }

    public boolean isMine() {
        return isMine;
    }

    public String getSymbol() {
        return symbol;
    }

    public void show() {
        symbol = value;
        isShown = true;
    }

    public boolean isShown() {
        return isShown;
    }

    public boolean hasValue() {

        if (isMine) return false;

        return Integer.parseInt(value) > 0;
    }

    public ArrayList<Cell> getSurroundingCells() {

        if (surroundingCells.isEmpty()) {
            setSurroundingCells();
        }

        return surroundingCells;
    }

    private void setSurroundingCells() {
        for (int i = xPos - 1; i <= xPos + 1; i++) {
            for (int j = yPos - 1; j <= yPos + 1; j++) {

                if (i == xPos && j == yPos) {

                } else {
                    try {
                        surroundingCells.add(myBoard[i][j]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                }
            }
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue() {

        if (isMine) {
            return;
        }

        if (Arrays.asList(myBoard).contains(null)) {
            return;
        }

        int surroundingMines = 0;

        for (Cell cell : getSurroundingCells()) {
            if (cell.isMine()) {
                surroundingMines++;
            }
        }

        value = Integer.toString(surroundingMines);
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;

        if (isShown) {
            return;
        } else if (isFlagged) {
            symbol = "F";
        } else {
            if (isMine) {
                symbol = "#";
            } else if (isShown) {
                symbol = value;
            } else {
                symbol = "*";
            }
        }
    }

}
