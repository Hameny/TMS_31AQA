package homeTask_6.Task3;

public class ATM {
  private int banknote20;
  private int banknote50;
  private int banknote100;

  public ATM(int banknote20, int banknote50, int banknote100) {
    this.banknote20 = banknote20;
    this.banknote50 = banknote50;
    this.banknote100 = banknote100;
  }

  public void addMoney(int add20, int add50, int add100) {
    banknote20 += add20;
    banknote50 += add50;
    banknote100 += add100;
    System.out.printf("Внесено: %d купюры по 20, %d купюры по 50, %d купюры по 100\n", add20, add50, add100);
  }

  public boolean withdraw(int amount) {
    System.out.println("Попытка снять: " + amount);

    int remaining = amount;
    int needed100 = Math.min(remaining / 100, banknote100);
    remaining -= needed100 * 100;

    int needed50 = Math.min(remaining / 50, banknote50);
    remaining -= needed50 * 50;

    int needed20 = remaining / 20;

    if (remaining % 20 != 0 || needed20 > banknote20) {
      System.out.println("Невозможно выдать запрошенную сумму имеющимися купюрами");
      return false;
    }

    banknote100 -= needed100;
    banknote50 -= needed50;
    banknote20 -= needed20;

    System.out.println("Выдано:");
    if (needed100 > 0) {
      System.out.println("Купюр номиналом 100: " + needed100 + " штук");
    }
    if (needed50 > 0) {
      System.out.println("Купюр номиналом 50: " + needed50 + " штук");
    }
    if (needed20 > 0) {
      System.out.println("Купюр номиналом 20: " + needed20 + " штук");
    }

    return true;
  }

  public void displayStatus() {
    System.out.println("\nТекущее состояние банкомата:");
    System.out.println("Купюра номиналом в 20: в банкомате " + banknote20 + " штук");
    System.out.println("Купюра номиналом в 50: в банкомате " + banknote50 + " штук");
    System.out.println("Купюра номиналом в 100: в банкомате " + banknote100 + " штук");
    System.out.println("Общая сумма в банкомате: " + getTotal() + "\n");
  }

  private int getTotal() {
    return banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
  }
}
