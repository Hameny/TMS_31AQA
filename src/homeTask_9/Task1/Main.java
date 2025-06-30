package homeTask_9.Task1;

import homeTask_9.Task1.Service.DocumentService;

public class Main {

  public static void main(String[] args) {
    Document[] testDocuments = {
        new Document("555123abс4561a2b"),
        new Document("5551234561a2b"),
        new Document("123abс4561a2b"),
        new Document("555123ab456"),
        new Document("123456789")
    };

    System.out.println("=== Комплексная проверка документов ===");
    for (Document doc : testDocuments) {
      DocumentService.validateDocument(doc);
    }

    System.out.println("\n=== Детальная проверка каждого документа ===");
    for (Document doc : testDocuments) {
      DocumentService.checkAllValidationsSeparately(doc);
    }
  }
}