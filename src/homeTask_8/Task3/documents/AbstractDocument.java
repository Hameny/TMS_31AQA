package homeTask_8.Task3.documents;

import java.time.LocalDate;

public abstract class AbstractDocument implements Document {

  protected String documentNumber;
  protected LocalDate documentDate;

  public AbstractDocument() {
  }

  public AbstractDocument(String documentNumber, LocalDate documentDate) {
    this.documentNumber = documentNumber;
    this.documentDate = documentDate;
  }

  public String getDocumentNumber() {
    return documentNumber;
  }

  @Override
  public LocalDate getDocumentDate() {
    return documentDate;
  }
}
