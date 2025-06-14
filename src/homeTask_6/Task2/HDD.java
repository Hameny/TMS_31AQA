package homeTask_6.Task2;

class HDD {
  private String name;
  private int capacity;
  private String type;

  public HDD() {
    this.name = "Kingstom";
    this.capacity = 256;
    this.type = "Внутренний";
  }

  public HDD(String name, int capacity, String type) {
    this.name = name;
    this.capacity = capacity;
    this.type = type;
  }

  public void displayInfo() {
    System.out.println("HDD: " + name + ", Capacity: " + capacity + "GB, Type: " + type);
  }
}

