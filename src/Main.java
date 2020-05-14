import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Validate check = new Validate();
        TicTacToe game = new TicTacToe("X");
        game.initBoard();
        game.printBoard();

        do {
            System.out.print("Player " + game.getCurrentPlayer() + " turn!\n");
            int rowEnter = check.verifyIntegerNumber("please enter row coordinate (0-2): ", 0, 2);
            int colEnter = check.verifyIntegerNumber("please enter column coordinate (0-2): ", 0, 2);
            game.setMove(rowEnter, colEnter, game.getCurrentPlayer());
            game.printBoard();

            if (game.checkWin()) {
                System.out.println("Player " + game.getCurrentPlayer() + " win!\n");
                break;
            } else if (game.checkTie()) {
                System.out.println("Tie!");
                break;
            }

            game.swapPlayer();
        } while (true);
    }


}
