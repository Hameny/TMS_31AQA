package homeTask_8.Task3.documents;

import java.time.LocalDate;

public class SupplyContract extends AbstractDocument {

  private String productType;
  private int quantity;

  public SupplyContract() {
    super();
  }

  public SupplyContract(String documentNumber, LocalDate documentDate, String productType,
      int quantity) {
    super(documentNumber, documentDate);
    this.productType = productType;
    this.quantity = quantity;
  }

  @Override
  public void printInfo() {
    System.out.println("Контракт на поставку товаров:");
    System.out.println("Номер документа: " + documentNumber);
    System.out.println("Дата документа: " + documentDate);
    System.out.println("Тип товаров: " + productType);
    System.out.println("Количество товаров: " + quantity);
    System.out.println();
  }

}
