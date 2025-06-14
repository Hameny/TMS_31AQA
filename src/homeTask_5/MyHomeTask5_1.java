package homeTask_5;

public class MyHomeTask5_1 {
  public static void main(String[] args) {
    createAndDisplayChessBoard();
  }

  private static void createAndDisplayChessBoard() {
    String[][] chessBoard = createChessBoard(8, 8);

    printChessBoard(chessBoard);
  }

  private static String[][] createChessBoard(int rows, int cols) {
    String[][] board = new String[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j] = (i + j) % 2 == 0 ? "W" : "B";
      }
    }
    return board;
  }

  private static void printChessBoard(String[][] board) {
    System.out.println("Шахматная доска:");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
}

