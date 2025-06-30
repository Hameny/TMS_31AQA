package homeTask_8.Task3.documents;

import java.time.LocalDate;

public class FinancialInvoice extends AbstractDocument {

  private double totalAmount;
  private String departmentCode;

  public FinancialInvoice() {
    super();
  }

  public FinancialInvoice(String documentNumber, LocalDate documentDate, double totalAmount, String departmentCode) {
    super(documentNumber, documentDate);
    this.totalAmount = totalAmount;
    this.departmentCode = departmentCode;
  }

  @Override
  public void printInfo() {
    System.out.println("Финансовая накладная:");
    System.out.println("Номер документа: " + documentNumber);
    System.out.println("Дата документа: " + documentDate);
    System.out.println("Итоговая сумма: " + totalAmount);
    System.out.println("Код департамента: " + departmentCode);
    System.out.println();
  }
}
