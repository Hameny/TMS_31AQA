package homeTask_4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MyHomeTask4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    containsNumber(scanner);
    removeNumberFromArray(scanner);
    randomArrayStatistics(scanner);

    scanner.close();
  }

  public static void containsNumber(Scanner scanner) {
    int[] array = {5, 12, 7, 3, 9, 14, 6};

    int numberToFind;
    while (true) {
      System.out.print("Введите число для поиска: ");
      String input = scanner.nextLine();

      try {
        numberToFind = Integer.parseInt(input);
        break;
      } catch (NumberFormatException e) {
        System.out.println("Ошибка: введено не число. Пожалуйста, попробуйте снова.");
      }
    }

    boolean found = false;
    for (int num : array) {
      if (num == numberToFind) {
        found = true;
        break;
      }
    }

    if (found) {
      System.out.println("Число " + numberToFind + " входит в массив.");
    } else {
      System.out.println("Число " + numberToFind + " не входит в массив.");
    }
  }

  public static void removeNumberFromArray(Scanner scanner) {
    int[] originalArray = {1, 5, 2, 3, 5, 6, 4, 5, 2, 6, 5, 2, 6};

    System.out.print("Введите число для удаления: ");
    String input = scanner.nextLine();

    int numberToRemove;
    try {
      numberToRemove = Integer.parseInt(input);
    } catch (NumberFormatException e) {
      System.out.println("Ошибка: введено не число.");
      return;
    }

    boolean found = false;
    for (int num : originalArray) {
      if (num == numberToRemove) {
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("Заданное число не найдено в массиве.");
      return;
    }

    List<Integer> resultList = new ArrayList<>();
    for (int num : originalArray) {
      if (num != numberToRemove) {
        resultList.add(num);
      }
    }

    int[] resultArray = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
      resultArray[i] = resultList.get(i);
    }

    System.out.println("Массив после удаления:");
    for (int num : resultArray) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void randomArrayStatistics(Scanner scanner) {
    int size;

    while (true) {
      System.out.print("Введите размер массива (целое число > 0): ");
      try {
        size = scanner.nextInt();
        scanner.nextLine();
        if (size > 0) {
          break;
        } else {
          System.out.println("Пожалуйста, введите число больше нуля.");
        }
      } catch (InputMismatchException e) {
        System.out.println("Ошибка: введено не число. Попробуйте снова.");
        scanner.next();
      }
    }

    int[] array = new int[size];

    for (int i = 0; i < size; i++) {
      array[i] = (int) (Math.random() * 100);
    }

    int max = array[0];
    int min = array[0];
    double sum = 0;

    for (int num : array) {
      if (num > max) {
        max = num;
      }
      if (num < min) {
        min = num;
      }
      sum += num;
    }

    double average = sum / size;

    System.out.println("Массив: ");
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println("\nМаксимальное значение: " + max);
    System.out.println("Минимальное значение: " + min);
    System.out.println("Среднее значение: " + average);
  }
}
