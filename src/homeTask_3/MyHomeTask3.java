package homeTask_3;

import java.util.Scanner;

public class MyHomeTask3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    displaySeasonWithSwitchCase(scanner);
    displaySeasonWithIfElse(scanner);
    determiningNumberIsEvenOrOdd(scanner);
    printSenseOfTemperature(scanner);
    printColorOFRainbow(scanner);
    printOddNumber();
    reductionOutput();
    AddingNumbers(scanner);
    outputSequence();
    printFirstTenNumbersWithStepFive();
    outputNumberAndHisSquare();
    outputNumberFibonacci();
    calculateSumOfContribution(scanner);
    outputMultiplicationTable();
    scanner.close();
  }

  public static void displaySeasonWithSwitchCase(Scanner scanner) {
    System.out.print("Введите номер месяца (1-12): ");
    int month = scanner.nextInt();
    String season = switch (month) {
      case 12, 1, 2 -> "Зима";
      case 3, 4, 5 -> "Весна";
      case 6, 7, 8 -> "Лето";
      case 9, 10, 11 -> "Осень";
      default -> "Некорректный номер месяца";
    };
    System.out.println("Пора года: " + season);
    System.out.println("//////////////////////////////////////");
  }

  public static void displaySeasonWithIfElse(Scanner scanner) {
    System.out.print("Введите номер месяца (1-12): ");
    int month = scanner.nextInt();
    String season;

    if (month >= 3 && month <= 5) {
      season = "Весна";
    } else if (month >= 6 && month <= 8) {
      season = "Лето";
    } else if (month >= 9 && month <= 11) {
      season = "Осень";
    } else if (month == 12 || month == 1 || month == 2) {
      season = "Зима";
    } else {
      season = "Некорректный номер месяца";
    }

    System.out.println("Пора года: " + season);
    System.out.println("///////////////////////////////////");
  }

  public static void determiningNumberIsEvenOrOdd(Scanner scanner){
    System.out.print("Введите число: ");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
      System.out.println("Число чётное");
    } else {
      System.out.println("Число нечётное");
    }
    System.out.println("/////////////////////////////////////");
  }

  public static void printSenseOfTemperature(Scanner scanner){
    System.out.print("Введите температуру на улице: ");
    int t = scanner.nextInt();

    if (t > -5) {
      System.out.println("Тепло");
    } else if (t > -20) { // при этом t <= -5
      System.out.println("Нормально");
    } else { // t <= -20
      System.out.println("Холодно");
    }
    System.out.println("///////////////////////////////////");
  }

  public static void printColorOFRainbow(Scanner scanner){
    System.out.print("Введите номер цвета радуги (1-7): ");
    int number = scanner.nextInt();

    String color;

    if (number == 1) {
      color = "Красный";
    } else if (number == 2) {
      color = "Оранжевый";
    } else if (number == 3) {
      color = "Жёлтый";
    } else if (number == 4) {
      color = "Зеленый";
    } else if (number == 5) {
      color = "Голубой";
    } else if (number == 6) {
      color = "Синий";
    } else if (number == 7) {
      color = "Фиолетовый";
    } else {
      color = "Некорректный номер";
    }

    System.out.println("Цвет радуги: " + color);
    System.out.println("///////////////////////////////////");
  }

  public static void printOddNumber() {
    for (int i = 1; i <= 99; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
    System.out.println("///////////////////////////////////");
  }

  public static void reductionOutput() {
    for (int i = 5; i >= 1; i--) {
      System.out.println(i);
    }
    System.out.println("///////////////////////////////////");
  }

  public static void AddingNumbers(Scanner scanner) {
    System.out.print("Введите положительное целое число: ");
    int number = scanner.nextInt();

    if (number <= 0) {
      System.out.println("Число должно быть положительным.");
      return;
    }

    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += i;
    }
    System.out.println("Сумма чисел от 1 до " + number + " равна: " + sum);
    System.out.println("///////////////////////////////////");
  }

  public static void outputSequence() {
    int value = 7;
    while (value <= 98) {
      System.out.print(value + " ");
      value += 7;
    }
    System.out.println("///////////////////////////////////");
  }

  public static void printFirstTenNumbersWithStepFive() {
    int start = 0;
    int step = -5;
    int count = 10;

    for (int i = 0; i < count; i++) {
      int value = start + i * step;
      System.out.println(value);
    }
  }

  public static void outputNumberAndHisSquare() {
    for (int i = 10; i <= 20; i++) {
      System.out.println("Квадрат числа " + i + " равен " + (i * i));
    }
    System.out.println("///////////////////////////////////");
  }

  public static void outputNumberFibonacci() {
    int n = 11;
    int first = 0;
    int second = 1;

    System.out.println("Первые " + n + " членов последовательности Фибоначчи:");
    for (int i = 0; i < n; i++) {
      System.out.print(first + " ");
      int next = first + second;
      first = second;
      second = next;
    }
    System.out.println("///////////////////////////////////");
  }

  public static void calculateSumOfContribution(Scanner scanner) {
    System.out.print("Введите сумму вклада: ");
    float depositAmount = scanner.nextFloat();
    System.out.print("Введите количество месяцев: ");
    int months = scanner.nextInt();

    float interestRate = 0.07f;
    for (int i = 1; i <= months; i++) {
      depositAmount += depositAmount * interestRate;
    }
    System.out.printf("Конечная сумма вклада после %d месяцев: %.2f%n", months, depositAmount);
    System.out.println("///////////////////////////////////");
  }

  public static void outputMultiplicationTable() {
    int size = 10;
    System.out.print("    ");
    for (int i = 1; i <= size; i++) {
      System.out.printf("%4d", i);
    }
    System.out.println();
    System.out.print("    ");
    for (int i = 1; i <= size; i++) {
      System.out.print("----");
    }
    System.out.println();
    for (int i = 1; i <= size; i++) {
      System.out.printf("%3d|", i);
      for (int j = 1; j <= size; j++) {
        System.out.printf("%4d", i * j);
      }
      System.out.println();
    }
    System.out.println("///////////////////////////////////");
  }
}
