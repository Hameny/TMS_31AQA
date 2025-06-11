package homeTask_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyHomeTask4 {

  public static void main(String[] args) {

    containsNumber();
    removeNumberFromArray();
  }
  public static void containsNumber(){
    int[] array = {5, 12, 7, 3, 9, 14, 6};

    Scanner scanner = new Scanner(System.in);
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

    // Вывод результата
    if (found) {
      System.out.println("Число " + numberToFind + " входит в массив.");
    } else {
      System.out.println("Число " + numberToFind + " не входит в массив.");
    }

  }
  public static void removeNumberFromArray(){
    Scanner scanner = new Scanner(System.in);
    int[] originalArray = {1, 5, 2, 3, 5, 6, 4, 5, 2, 6, 5, 2, 6};

    System.out.print("Введите число для удаления: ");
    String input = scanner.nextLine();

    int numberToRemove;

    try {
      numberToRemove = Integer.parseInt(input);
    } catch (NumberFormatException e) {
      System.out.println("Ошибка: введено не число.");
      scanner.close();
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
      scanner.close();
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
}
