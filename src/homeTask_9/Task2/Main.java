package homeTask_9.Task2;

import homeTask_9.Task2.Validators.Validator;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Программа проверки логина и пароля");
    System.out.println("----------------------------------");

    while (true) {
      System.out.println("\nВведите данные (или 'exit' для выхода):");

      System.out.print("Логин (должен быть <20 символов без пробелов): ");
      String login = scanner.nextLine();

      if (login.equalsIgnoreCase("exit")) {
        break;
      }

      System.out.print("Пароль (<20 символов, без пробелов, с цифрой): ");
      String password = scanner.nextLine();

      System.out.print("Подтвердите пароль: ");
      String confirmPassword = scanner.nextLine();

      System.out.printf("\nПроверка: login='%s', password='%s', confirm='%s'%n",
          login, password, confirmPassword);

      boolean isValid = Validator.validateCredentials(login, password, confirmPassword);
      System.out.println("Результат валидации: " + (isValid ? "Успешно" : "Ошибка"));
    }

    System.out.println("Программа завершена.");
    scanner.close();
  }
}