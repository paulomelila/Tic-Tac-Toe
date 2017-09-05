import java.util.Scanner;

/**
 * Created by Paulo on 05/09/2017.
 */
public class GameDemo {

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("WELCOME TO TIC TAC TOE!");
        System.out.println("Designer: Paulo Melila");
        System.out.println("Class: Cornerstone WMDP");
        System.out.println("Date: 05/09/2017\n");

        System.out.println("1 --- person vs. person");
        System.out.println("2 --- person vs. random computer\n");

        System.out.println("Enter your choice (1 or 2):");
        System.out.println("================================");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("You have entered choice " + choice);
        System.out.println("The current status is: ");

        Board board = new Board();
        board.createBoard();

        if (choice == 1) {
            // player vs. player
            Player p = new Player();
            p.PlayerVsPlayer(Board.gameBoard);
        }

        if (choice == 2) {
            // player vs. computer
            Player p = new Player();
            p.PlayerVsCPU(Board.gameBoard);
        }
    }
}
