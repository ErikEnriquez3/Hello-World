package test.mine.sweeper;

import java.util.ArrayList;
import java.util.Arrays;

public class Cell {

    private final int xPos;
    private final int yPos;

    private final boolean isMine;
    private boolean isFlagged;
    private boolean isShown;

    private String symbol;
    private String value;

    private Cell[][] myBoard;
    private ArrayList<Cell> surroundingCells;

    public Cell(int x, int y, boolean isMine, Cell[][] board) {

        this.isMine = isMine;
        this.isFlagged = false;
        this.isShown = false;

        this.myBoard = board;
        surroundingCells = new ArrayList<>();

        this.xPos = x;
        this.yPos = y;
        symbol = "█";

        if (this.isMine) {
            value = "☼";
        }
    }

    public boolean isMine() {
        return isMine;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public String getSymbol() {
        return symbol;
    }

    public void show() {
        symbol = value;
        isShown = false;
    }

    public boolean isShown() {
        return isShown;
    }

    public boolean hasValue() {

        if (isMine == true) return false;

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
                        continue;
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
                symbol = "☼";
            } else if (isShown) {
                symbol = value;
            } else {
                symbol = "█";
            }
        }
    }

    public boolean equals(Object obj) {
        Cell cell = (Cell) obj;
        return cell.getyPos() == yPos && cell.getxPos() == xPos && cell.isMine() == isMine && cell.getValue().equals(value);
    }

    public String toString() {
        return "X: " + xPos + " Y: " + yPos + " Value:" + value;
    }

}
