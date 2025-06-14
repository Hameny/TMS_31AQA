package homeTask_5;

public class MyHomeTask5_4 {
    public static void main(String[] args) {
      printArrayDiagonals();
    }

    private static void printArrayDiagonals() {
      int[][] array = createSquareArray();

      System.out.println("Исходный массив:");
      printArray(array);

      System.out.println("\nГлавная диагональ:");
      printMainDiagonal(array);

      System.out.println("\nПобочная диагональ:");
      printSecondaryDiagonal(array);
    }

    private static int[][] createSquareArray() {
      return new int[][] {
          {9, 6, 3},
          {4, 5, 6},
          {9, 6, 3}
      };
    }

    private static void printArray(int[][] array) {
      for (int[] row : array) {
        for (int num : row) {
          System.out.print(num + " ");
        }
        System.out.println();
      }
    }

    private static void printMainDiagonal(int[][] array) {
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i][i] + " ");
      }
    }

    private static void printSecondaryDiagonal(int[][] array) {
      for (int i = 0; i < array.length; i++) {
        System.out.print(array[i][array.length - 1 - i] + " ");
      }
    }
  }

