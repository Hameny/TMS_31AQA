package homeTask_9.Task1.Exception;

public class No555StartException extends DocumentValidationException {

  public No555StartException(String documentNumber) {
    super("Документ не начинается с '555': " + documentNumber);
  }
}
