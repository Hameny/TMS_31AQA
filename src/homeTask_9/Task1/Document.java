package homeTask_9.Task1;

import homeTask_9.Task1.Exception.*;

public class Document {

  private final String documentNumber;

  public Document(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public String getDocumentNumber() {
    return documentNumber;
  }

  public void validateAbсSequence() throws NoAbSequenceException {
    if (!documentNumber.contains("abс")) {
      throw new NoAbSequenceException(documentNumber);
    }
  }

  public void validate555Start() throws No555StartException {
    if (!documentNumber.startsWith("555")) {
      throw new No555StartException(documentNumber);
    }
  }

  public void validate1a2bEnd() throws No1a2bEndException {
    if (!documentNumber.endsWith("1a2b")) {
      throw new No1a2bEndException(documentNumber);
    }
  }

  public void fullValidate() throws DocumentValidationException {
    validate555Start();
    validateAbсSequence();
    validate1a2bEnd();
  }
}
