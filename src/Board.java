/**
 * Created by Paulo on 05/09/2017.
 */
public class Board {
    public static int cellIndex = 1;
    protected static char[][] gameBoard;

    public Board() {
        gameBoard = new char[3][3];

        for (int i = 0; i < gameBoard.length; ++i) {
            for (int j = 0; j < gameBoard[i].length; ++j) {
                gameBoard[i][j] = ' ';
            }
        }
    }

    public void createBoard () {
        cellIndex = 1;
        System.out.println("\n+-----------+");

        for (char[] row : gameBoard) {
            for (char column : row) {
                drawCell(column);
            }

            System.out.print("|");
            System.out.println("\n+-----------+");
        }

        System.out.println();
    }

    public void drawCell(char cell) {
        if (cell == 3) {
            System.out.print("| " + cellIndex + " ");
        }

        else {
            System.out.print("| " + cell + " ");
        }

        cellIndex++;
    }
}
