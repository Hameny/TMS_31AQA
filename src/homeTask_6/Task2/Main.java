package homeTask_6.Task2;

public class Main {

  public static void main(String[] args) {
    testComputers();
  }

  private static void testComputers() {
    Computer computer1 = new Computer(999.99, "Dell XPS");
    System.out.println("Компьютер 1 с конструктором по умолчанию:");
    computer1.displayInfo();

    RAM customRAM = new RAM("Kingston Fury", 16);
    HDD customHDD = new HDD("Seagate Barracuda", 1000, "Внешний");
    Computer computer2 = new Computer(1499.99, "Alienware Aurora",
        customRAM, customHDD);
    System.out.println("\nКомпьютер 2 с полной информацией:");
    computer2.displayInfo();
  }
}