package homeTask_9.Task1.Service;

import homeTask_9.Task1.Document;
import homeTask_9.Task1.Exception.*;

public class DocumentService {

  public static void validateDocument(Document doc) {
    try {
      doc.fullValidate();
      System.out.println("Документ " + doc.getDocumentNumber() + " прошел все проверки успешно!");
    } catch (DocumentValidationException e) {
      System.out.println("Ошибка валидации: " + e.getMessage());
    }
  }

  public static void checkAllValidationsSeparately(Document doc) {
    System.out.println("\nПроверка документа: " + doc.getDocumentNumber());

    try {
      doc.validate555Start();
      System.out.println("✓ Начинается с '555'");
    } catch (No555StartException e) {
      System.out.println(e.getMessage());
    }

    try {
      doc.validateAbсSequence();
      System.out.println("✓ Содержит 'abс'");
    } catch (NoAbSequenceException e) {
      System.out.println(e.getMessage());
    }

    try {
      doc.validate1a2bEnd();
      System.out.println("✓ Заканчивается на '1a2b'");
    } catch (No1a2bEndException e) {
      System.out.println(e.getMessage());
    }
  }
}
