package homeTask_5;

import java.util.Arrays;

public class MyHomeTask5_5 {
  public static void main(String[] args) {
    sortAndPrintArray();
  }

  private static void sortAndPrintArray() {
    int[][] array = create2DArray();

    System.out.println("Исходный массив:");
    printArray(array);
    sortRows(array);

    System.out.println("\nМассив после сортировки строк:");
    printArray(array);
  }

  private static int[][] create2DArray() {
    return new int[][] {
        {5, -2, -8, 0},
        {3, 0, 1, -2},
        {98, 99, 16, -2}
    };
  }

  private static void sortRows(int[][] array) {
    for (int[] row : array) {
      Arrays.sort(row);
    }
  }

  private static void printArray(int[][] array) {
    for (int[] row : array) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}
