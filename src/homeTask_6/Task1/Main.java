package homeTask_6.Task1;

public class Main {

  public static void main(String[] args) {
    testCreditCards();
  }

  private static void testCreditCards() {
    CreditCard card1 = new CreditCard("1234 5678 9012 3456", 1000);
    CreditCard card2 = new CreditCard("2345 6789 0123 4567", 1500);
    CreditCard card3 = new CreditCard("3456 7890 1234 5678", 2000);

    System.out.println("\nНачальное состояние карт:");
    card1.displayInfo();
    card2.displayInfo();
    card3.displayInfo();

    System.out.println("Выполняем операции с картами:");
    card1.deposit(500);
    card2.deposit(300);
    card3.withdraw(800);

    System.out.println("\nТекущее состояние карт:");
    card1.displayInfo();
    card2.displayInfo();
    card3.displayInfo();
  }
}