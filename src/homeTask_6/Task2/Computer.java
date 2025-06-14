package homeTask_6.Task2;

class Computer {
  private double price;
  private String model;
  private RAM ram;
  private HDD hdd;

  public Computer(double price, String model) {
    this.price = price;
    this.model = model;
    this.ram = new RAM();
    this.hdd = new HDD();
  }

  public Computer(double price, String model, RAM ram, HDD hdd) {
    this.price = price;
    this.model = model;
    this.ram = ram;
    this.hdd = hdd;
  }

  public void displayInfo() {
    System.out.println("\nИнформация о компьютере:");
    System.out.println("Model: " + model);
    System.out.println("Price: $" + price);
    ram.displayInfo();
    hdd.displayInfo();
  }
}

