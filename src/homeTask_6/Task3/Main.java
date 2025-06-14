package homeTask_6.Task3;

public class Main {
  public static void main(String[] args) {
    testATM();
  }

  private static void testATM() {
    ATM atm = new ATM(12, 15, 300);

    atm.displayStatus();
    atm.addMoney(2, 3, 1);
    atm.displayStatus();
    atm.withdraw(370);
    atm.displayStatus();
    atm.withdraw(230);
    atm.displayStatus();
    atm.withdraw(50000);
  }
}

