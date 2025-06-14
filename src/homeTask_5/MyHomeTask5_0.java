package homeTask_5;

import java.util.Scanner;

public class MyHomeTask5_0 {
  public static void main(String[] args) {
    processThreeDArray();
  }

  private static void processThreeDArray() {
    int layers = 2, rows = 3, cols = 2;
    int[][][] array = create3DArray(layers, rows, cols);

    System.out.println("Исходный массив:");
    print3DArray(array);

    int increment = getIncrementValue();

    incrementArray(array, increment);

    System.out.println("\nМассив после увеличения на " + increment + ":");
    print3DArray(array);
  }

  private static int[][][] create3DArray(int l, int r, int c) {
    int[][][] arr = new int[l][r][c];
    int value = 1;
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < r; j++) {
        for (int k = 0; k < c; k++) {
          arr[i][j][k] = value++;
        }
      }
    }
    return arr;
  }

  private static void print3DArray(int[][][] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Слой " + (i + 1) + ":");
      for (int j = 0; j < arr[i].length; j++) {
        for (int k = 0; k < arr[i][j].length; k++) {
          System.out.printf("%4d", arr[i][j][k]);
        }
        System.out.println();
      }
      System.out.println();
    }
  }

  private static int getIncrementValue() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число для увеличения элементов: ");

    while (!scanner.hasNextInt()) {
      System.out.println("Ошибка! Введите целое число.");
      scanner.next();
      System.out.print("Попробуйте снова: ");
    }

    return scanner.nextInt();
  }

  private static void incrementArray(int[][][] arr, int increment) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        for (int k = 0; k < arr[i][j].length; k++) {
          arr[i][j][k] += increment;
        }
      }
    }
  }
}
