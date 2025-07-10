package homeTask_10;



public class Main {

  public static void main(String[] args) {
    String documentNumber = "5651-abc-176a-def-5g6h";
    System.out.println("Номер документа : " + documentNumber);

    DocumentProcessor.printFirstTwoBlocks(documentNumber);
    DocumentProcessor.replaceLettersWithStars(documentNumber);
    DocumentProcessor.printLettersInFormat(documentNumber);
    DocumentProcessor.printLettersWithStringBuilder(documentNumber);
    DocumentProcessor.checkForAbcSequence(documentNumber);
    DocumentProcessor.checkStartsWith555(documentNumber);
    DocumentProcessor.checkEndsWith1a2b(documentNumber);
  }
}