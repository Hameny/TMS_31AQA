package homeTask_8.Task3.main;

import homeTask_8.Task3.documents.*;
import homeTask_8.Task3.register.Register;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
  public static void main(String[] args) {
    Register register = new Register();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    try {
      SupplyContract supplyContract = new SupplyContract(
          "SC123",
          LocalDate.parse("01.06.2025", formatter),
          "Компьютеры",
          10
      );

      EmployeeContract employeeContract = new EmployeeContract(
          "EC456",
          LocalDate.parse("25.06.2025", formatter),
          LocalDate.parse("25.06.2025", formatter),
          LocalDate.parse("24.06.2027", formatter),
          "Киселев Иван Алексеевич"
      );

      FinancialInvoice financialInvoice = new FinancialInvoice(
          "FI789",
          LocalDate.parse("10.06.2025", formatter),
          50000.0,
          "DPT01"
      );

      register.addDocument(supplyContract);
      register.addDocument(employeeContract);
      register.addDocument(financialInvoice);

      System.out.println("Информация о контракте на поставку:");
      register.showDocumentInfo(supplyContract);

      System.out.println("Информация о контракте с сотрудником:");
      register.showDocumentInfo(employeeContract);

      System.out.println("Информация о финансовой накладной:");
      register.showDocumentInfo(financialInvoice);

    } catch (DateTimeParseException e) {
      e.printStackTrace();
    }
  }
}
