package homeTask_7.Task1;

public class Phone {
  private String number;
  private String model;
  private double weight;

  public Phone() {
    this("", "", 0.0);
  }

  public Phone(String number, String model) {
    this(number, model, 0.0);
  }

  public Phone(String number, String model, double weight) {
    this.number = number;
    this.model = model;
    this.weight = weight;
  }

  public void receiveCall(String name) {
    System.out.println("Звонит " + name);
  }

  public void receiveCall(String name, String callerNumber) {
    System.out.println("Звонит " + name + ". Номер звонящего: " + callerNumber);
  }

  public String getNumber() {
    return number;
  }

  public void sendMessage(String... numbers) {
    System.out.println("Отправка сообщения на номера:");
    for (String num : numbers) {
      System.out.println(num);
    }
  }

  public String getModel() {
    return model;
  }

  public double getWeight() {
    return weight;
  }
}

