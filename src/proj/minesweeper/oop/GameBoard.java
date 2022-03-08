package proj.minesweeper.oop;

public class GameBoard {
    Tiles[][] squares; //Attributes


    public void GameBoard(int bRow, int bColumn) { //Constructors

        squares = new Tiles[bRow][bColumn];

        for(int r=0;r<bRow;r++);
        {
            for (int c = 0; c <bColumn; c++) ;
            {
                System.out.println(" ");
            }
        }



    }

}