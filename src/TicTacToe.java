import java.util.Scanner;

public class TicTacToe {
    public String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    private String currentPlayer;


    public TicTacToe(String firstPlayer) {
        this.board = new String[ROWS][COLUMNS];
        this.currentPlayer = firstPlayer;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    //initial board
    public void initBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = "-";
            }
        }
    }

    public void printBoard() {
        System.out.println("---------");
        System.out.printf("| %s %s %s |\n" +
                        "| %s %s %s |\n" +
                        "| %s %s %s |\n",
                board[0][0], board[0][1], board[0][2],
                board[1][0], board[1][1], board[1][2],
                board[2][0], board[2][1], board[2][2]);
        System.out.println("---------");
    }

    public boolean isBoardFull() {
        boolean boardFull = true;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (board[i][j].equals("-")) {
                    boardFull = false;
                }
            }
        }
        return boardFull;
    }

    public boolean checkTie() {
        return (!checkWin() && isBoardFull());
    }

    public boolean checkWin() {
        return rowWin() || columnWin() || diagonalWin();
    }

    public boolean rowWin() {
        boolean rowWin = false;
        for (int i = 0; i < ROWS; i++) {
            if (!board[i][0].matches("-") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                rowWin = true;
            }
        }
        return rowWin;
    }

    public boolean columnWin() {
        boolean colWin = false;
        for (int j = 0; j < COLUMNS; j++) {
            if (!board[0][j].matches("-") && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) {
                colWin = true;
            }
        }
        return colWin;
    }

    public boolean diagonalWin() {
        boolean dia1 = !board[0][0].matches("-") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]);
        boolean dia2 = !board[0][2].matches("-") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]);
        return dia1 || dia2;
    }


    //setting player move
    public boolean setMove(int i, int j, String currentPlayer) {

        Scanner sc = new Scanner(System.in);

        while(!this.board[i][j].equals("-")) {
            System.out.println("That position already entered. Please choose again!");
            i = sc.nextInt();
            j = sc.nextInt();
        }

        if (this.board[i][j].equals("-")) {
            board[i][j] = currentPlayer;
            return true;
        }
        return false;
    }

    //swap player
    public void swapPlayer() {
        if (currentPlayer == "X") {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }

    }


}
