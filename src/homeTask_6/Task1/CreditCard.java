package homeTask_6.Task1;

public class CreditCard {

  private String accountNumber;
  private double balance;

  public CreditCard(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("На карту " + accountNumber + " внесено: " + amount);
    } else {
      System.out.println("Сумма для пополнения должна быть положительной");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0) {
      if (balance >= amount) {
        balance -= amount;
        System.out.println("С карты " + accountNumber + " снято: " + amount);
      } else {
        System.out.println("Недостаточно средств на карте " + accountNumber);
      }
    } else {
      System.out.println("Сумма для снятия должна быть положительной");
    }
  }

  public void displayInfo() {
    System.out.println("Карта: " + accountNumber + ", Баланс: " + balance);
  }
}

