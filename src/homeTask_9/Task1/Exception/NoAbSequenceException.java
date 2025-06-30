package homeTask_9.Task1.Exception;

public class NoAbSequenceException extends DocumentValidationException {

  public NoAbSequenceException(String documentNumber) {
    super("Документ не содержит последовательность 'abс': " + documentNumber);
  }
}
