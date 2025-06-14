package homeTask_6.Task2;

class RAM {
  private String name;
  private int capacity;

  public RAM() {
    this.name = "Samsung";
    this.capacity = 8;
  }

  public RAM(String name, int capacity) {
    this.name = name;
    this.capacity = capacity;
  }

  public void displayInfo() {
    System.out.println("RAM: " + name + ", Capacity: " + capacity + "GB");
  }
}

