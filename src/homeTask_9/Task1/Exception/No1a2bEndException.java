package homeTask_9.Task1.Exception;

public class No1a2bEndException extends DocumentValidationException {

  public No1a2bEndException(String documentNumber) {
    super("Документ не заканчивается на '1a2b': " + documentNumber);
  }
}
