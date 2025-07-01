package homeTask_9.Task2.Exceptions;

public class WrongPasswordException extends Exception {

  public WrongPasswordException() {
    super("Неверный пароль");
  }

  public WrongPasswordException(String message) {
    super(message);
  }
}
