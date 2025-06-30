package homeTask_8.Task3.register;

import homeTask_8.Task3.documents.Document;

public class Register {

  private static final int MAX_SIZE = 10;
  private Document[] documents;
  private int count;

  public Register() {
    documents = new Document[MAX_SIZE];
    count = 0;
  }

  public boolean addDocument(Document doc) {
    if (count < MAX_SIZE) {
      documents[count] = doc;
      count++;
      return true;
    } else {
      System.out.println("Регистр полон. Невозможно добавить документ.");
      return false;
    }
  }

  public void showDocumentInfo(Document doc) {
    if (doc != null) {
      doc.printInfo();
    } else {
      System.out.println("Документ не найден.");
    }
  }
}
