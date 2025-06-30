package homeTask_8.Task3.documents;

import java.time.LocalDate;

public class EmployeeContract extends AbstractDocument {
  private LocalDate startDate;
  private LocalDate endDate;
  private String employeeName;

  public EmployeeContract() {
    super();
  }

  public EmployeeContract(String documentNumber, LocalDate documentDate, LocalDate startDate, LocalDate endDate, String employeeName) {
    super(documentNumber, documentDate);
    this.startDate = startDate;
    this.endDate = endDate;
    this.employeeName = employeeName;
  }

  @Override
  public void printInfo() {
    System.out.println("Контракт с сотрудником:");
    System.out.println("Номер документа: " + documentNumber);
    System.out.println("Дата документа: " + documentDate);
    System.out.println("Дата начала: " + startDate);
    System.out.println("Дата окончания: " + endDate);
    System.out.println("Имя сотрудника: " + employeeName);
    System.out.println();
  }
}
