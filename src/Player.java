import java.util.Random;
import java.util.Scanner;

/**
 * Created by Paulo on 05/09/2017.
 */

public class Player extends Board {
    int rounds = 0;

    public boolean gameIsOver() {

        // PLAYER ONE WINS
        if (gameBoard[0][0] == 'X' && gameBoard[0][1] == 'X' && gameBoard[0][2] == 'X') {
            System.out.println("Game is over. Player 1 won.");
            return true;
        }
        if (gameBoard[1][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[1][2] == 'X') {
            System.out.println("Game is over. Player 1 won.");
            return true;
        }
        if (gameBoard[2][0] == 'X' && gameBoard[2][1] == 'X' && gameBoard[2][2] == 'X') {
            System.out.println("Game is over. Player 1 won.");
            return true;
        }
        if (gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X') {
            System.out.println("Game is over. Player 1 won.");
            return true;
        }
        if (gameBoard[0][1] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][1] == 'X') {
            System.out.println("Game is over. Player 1 won.");
            return true;
        }
        if (gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X') {
            System.out.println("Game is over. Player 1 won.");
            return true;
        }
        if (gameBoard[0][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][2] == 'X') {
            System.out.println("Game is over. Player 1 won.");
            return true;
        }
        if (gameBoard[0][2] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][0] == 'X') {
            System.out.println("Game is over. Player 1 won.");
            return true;
        }


        // PLAYER TWO WINS
        if (gameBoard[0][0] == 'O' && gameBoard[0][1] == 'O' && gameBoard[0][2] == 'O') {
            System.out.println("Game is over. Player 2 won.");
            return true;
        }
        if (gameBoard[1][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[1][2] == 'O') {
            System.out.println("Game is over. Player 2 won.");
            return true;
        }
        if (gameBoard[2][0] == 'O' && gameBoard[2][1] == 'O' && gameBoard[2][2] == 'O') {
            System.out.println("Game is over. Player 2 won.");
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O') {
            System.out.println("Game is over. Player 2 won.");
            return true;
        }
        if (gameBoard[0][1] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][1] == 'O') {
            System.out.println("Game is over. Player 2 won.");
            return true;
        }
        if (gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O') {
            System.out.println("Game is over. Player 2 won.");
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][2] == 'O') {
            System.out.println("Game is over. Player 2 won.");
            return true;
        }
        if (gameBoard[0][2] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][0] == 'O') {
            System.out.println("Game is over. Player 2 won.");
            return true;
        }

        return false;
    }

    public void PlayerVsPlayer (char [][] gameBoard) {
        Board.gameBoard = gameBoard;

        while (!gameIsOver()) {
            // PLAYER ONE
            System.out.println("Player 1: make your move");
            Scanner p1 = new Scanner(System.in);
            System.out.println("Enter the row: ");
            int p1_row = p1.nextInt();
            System.out.println("Enter the column: ");
            int p1_col = p1.nextInt();
            gameBoard[p1_row - 1][p1_col - 1] = 'X';
            System.out.println("Good! The current status is: ");
            createBoard();

            rounds++;
            if (rounds == 9) {
                System.out.println("Game is over. It's a tie.");
                break;
            }

            // PLAYER TWO
            System.out.println("Player 2: make your move");
            Scanner p2 = new Scanner(System.in);
            System.out.println("Enter the row: ");
            int p2_row = p2.nextInt();
            System.out.println("Enter the column: ");
            int p2_col = p2.nextInt();
            gameBoard[p2_row - 1][p2_col - 1] = 'O';
            System.out.println("Good! The current status is: ");
            createBoard();

            rounds++;
            if (rounds == 9) {
                System.out.println("Game is over. It's a tie.");
                break;
            }
        }
    }

    public void PlayerVsCPU (char [][] gameBoard) {
        Board.gameBoard = gameBoard;

        while (!gameIsOver()) {
            // PLAYER ONE
            System.out.println("Player 1: make your move");
            Scanner p1 = new Scanner(System.in);
            System.out.println("Enter the row: ");
            int p1_row = p1.nextInt();
            System.out.println("Enter the column: ");
            int p1_col = p1.nextInt();
            gameBoard[p1_row - 1][p1_col - 1] = 'X';
            System.out.println("Good! The current status is: ");
            createBoard();

            rounds++;
            if (rounds == 9) {
                System.out.println("Game is over. It's a tie.");
                break;
            }

            // CPU
            System.out.println("CPU: make your move");

            Random rand = new Random();

            System.out.println("CPU chooses a row: ");
            int cpu_row = rand.nextInt(3) + 1;
            System.out.println(cpu_row);

            System.out.println("CPU chooses the column: ");
            int cpu_col = rand.nextInt(3) + 1;
            System.out.println(cpu_col);

            gameBoard[cpu_row - 1][cpu_col - 1] = 'O';

            System.out.println("Good! The current status is: ");
            createBoard();

            rounds++;
            if (rounds == 9) {
                System.out.println("Game is over. It's a tie.");
                break;
            }
        }
    }
}
