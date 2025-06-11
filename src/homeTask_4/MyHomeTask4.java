package homeTask_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MyHomeTask4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    containsNumber(scanner);
    removeNumberFromArray(scanner);
    randomArrayStatistics(scanner);
    comparisonArray(scanner);
    printTwoArray(scanner);
    changingArray();
    sortingName();
    sortBubble();

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

  public static void comparisonArray(Scanner scanner){
    int[] array1 = new int[5];
    int[] array2 = new int[5];

    System.out.println("Введите 5 чисел для первого массива:");
    fillArray(array1, scanner);

    System.out.println("Введите 5 чисел для второго массива:");
    fillArray(array2, scanner);

    System.out.println("Первый массив: " + arrayToString(array1));
    System.out.println("Второй массив: " + arrayToString(array2));

    double average1 = calculateAverage(array1);
    double average2 = calculateAverage(array2);

    System.out.printf("Среднее арифметическое первого массива: %.2f%n", average1);
    System.out.printf("Среднее арифметическое второго массива: %.2f%n", average2);

    // Сравнение
    if (average1 > average2) {
      System.out.println("Среднее арифметическое первого массива больше.");
    } else if (average2 > average1) {
      System.out.println("Среднее арифметическое второго массива больше.");
    } else {
      System.out.println("Средние арифметические массивов равны.");
    }

    scanner.close();
  }

  private static void fillArray(int[] array, Scanner scanner) {
    int count = 0;
    while (count < array.length) {
      System.out.printf("Введите число #%d: ", count + 1);
      if (scanner.hasNextLine()) {
        String input = scanner.nextLine();
        try {
          int num = Integer.parseInt(input.trim());
          array[count] = num;
          count++;
        } catch (NumberFormatException e) {
          System.out.println("Ошибка: введено не число. Пожалуйста, попробуйте снова.");
        }
      }
    }
  }

  private static String arrayToString(int[] array) {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < array.length; i++) {
      sb.append(array[i]);
      if (i < array.length - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }

  private static double calculateAverage(int[] array) {
    int sum = 0;
    for (int num : array) {
      sum += num;
    }
    return (double) sum / array.length;
  }

  public static void printTwoArray(Scanner scanner){
    int p;

    while (true) {
      System.out.print("Введите размер массива (от 6 до 10): ");
      if (scanner.hasNextInt()) {
        p = scanner.nextInt();
        if (p > 5 && p <= 10) {
          break;
        } else {
          System.out.println("Некорректный ввод. Размер массива должен быть больше 5 и не больше 10.");
        }
      } else {
        System.out.println("Пожалуйста, введите целое число.");
        scanner.next();
      }
    }

    int[] array = new int[p];
    Random rand = new Random();

    for (int i = 0; i < p; i++) {
      array[i] = rand.nextInt(100) - 50; // случайные числа от -50 до 49
    }

    System.out.println("Исходный массив:");
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println();

    ArrayList<Integer> evenElements = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evenElements.add(num);
      }
    }

    if (evenElements.size() > 0) {
      System.out.println("Массив из четных элементов первого массива:");
      for (int num : evenElements) {
        System.out.print(num + " ");
      }
      System.out.println();
    } else {
      System.out.println("В первом массиве нет четных элементов.");
    }
  }

  public static void changingArray(){
    int[] array = {1, 4, 123, 422, 511, 698, 7222, 18, 2219, 1000};

    System.out.println("Исходный массив:");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();

    for (int i = 1; i < array.length; i += 2) {
      array[i] = 0;
    }

    System.out.println("Изменённый массив:");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void sortingName(){
    String[] names = {
        "Иван",
        "Алексей",
        "Мария",
        "Дмитрий",
        "Анна",
        "София",
        "Борис",
        "Елена"
    };

    Arrays.sort(names);

    System.out.println("Отсортированные имена:");
    for (String name : names) {
      System.out.println(name);
    }
  }

  public static void sortBubble(){
    int[] array = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Исходный массив:");
    printArray(array);

    bubbleSort(array);

    System.out.println("Отсортированный массив:");
    printArray(array);
  }

  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped)
        break;
    }
  }

  public static void printArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

}
