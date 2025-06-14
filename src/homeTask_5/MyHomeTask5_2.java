package homeTask_5;

public class MyHomeTask5_2 {
  public static void main(String[] args) {
    multiplyMatrices();
  }

  private static void multiplyMatrices() {
    int[][] matrixA = {
        {1, 0, 0},
        {0, 1, 0},
        {0, 0, 0}
    };

    int[][] matrixB = {
        {1, 2, 3},
        {1, 1, 1},
        {0, 0, 0},
        {2, 1, 0}
    };

    int[][] result = multiply(matrixA, matrixB);

    System.out.println("Матрица A:");
    printMatrix(matrixA);

    System.out.println("\nМатрица B:");
    printMatrix(matrixB);

    System.out.print("\nРезультат умножения:");
    printResult(result);
  }

  private static int[][] multiply(int[][] a, int[][] b) {
    int[][] result = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          result[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    return result;
  }

  private static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      System.out.print("{");
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.print("} ");
    }
  }
  private static void printResult(int[][] matrix) {
    for (int[] row : matrix) {
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.print("  ");
    }
  }
}
