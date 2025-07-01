package homeTask_9.Task2.Validators;

import homeTask_9.Task2.Exceptions.*;

public class Validator {

  public static boolean validateCredentials(String login, String password, String confirmPassword) {
    try {
      validateLogin(login);
      validatePassword(password, confirmPassword);
      return true;
    } catch (WrongLoginException | WrongPasswordException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }

  private static void validateLogin(String login) throws WrongLoginException {
    if (login == null) {
      throw new WrongLoginException("Логин не может быть null");
    }

    if (login.length() >= 20) {
      throw new WrongLoginException("Логин должен быть меньше 20 символов");
    }

    if (login.contains(" ")) {
      throw new WrongLoginException("Логин не должен содержать пробелы");
    }
  }

  private static void validatePassword(String password, String confirmPassword)
      throws WrongPasswordException {
    if (password == null) {
      throw new WrongPasswordException("Пароль не может быть null");
    }

    if (password.length() >= 20) {
      throw new WrongPasswordException("Пароль должен быть меньше 20 символов");
    }

    if (password.contains(" ")) {
      throw new WrongPasswordException("Пароль не должен содержать пробелы");
    }

    if (!password.matches(".*\\d.*")) {
      throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру");
    }

    if (!password.equals(confirmPassword)) {
      throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают");
    }
  }
}
