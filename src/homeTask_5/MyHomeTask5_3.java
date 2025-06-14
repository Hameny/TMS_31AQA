package homeTask_5;

public class MyHomeTask5_3 {
  public static void main(String[] args) {
    processArray();
  }

  private static void processArray() {
    int[][] array = initializeArray();

    printArray(array);
    printArraySum(array);
  }

  private static int[][] initializeArray() {
    return new int[][] {
        {16, 2, 37},
        {43, 15, 6},
        {-7, 28, 19}
    };
  }

  private static void printArray(int[][] array) {
    System.out.println("Двумерный массив:");
    for (int[] row : array) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  private static void printArraySum(int[][] array) {
    int sum = 0;
    for (int[] row : array) {
      for (int num : row) {
        sum += num;
      }
    }
    System.out.println("\nСумма всех элементов массива: " + sum);
  }
}
