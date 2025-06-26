package homeTask_7;

public class Main {
  public static void main(String[] args) {
    Phone phone1 = new Phone("+375251231212", "Iphone 15pro", 150.5);
    Phone phone2 = new Phone("+375291231212", "Smsung A70");
    Phone phone3 = new Phone();

    System.out.println("Phone 1: номер - " + phone1.getNumber() + ", модель - " + phone1.getModel() + ", вес - " + phone1.getWeight());
    System.out.println("Phone 2: номер - " + phone2.getNumber() + ", модель - " + phone2.getModel() + ", вес - " + phone2.getWeight());
    System.out.println("Phone 3: номер - " + phone3.getNumber() + ", модель - " + phone3.getModel() + ", вес - " + phone3.getWeight());

    phone1.receiveCall("Павел");
    phone2.receiveCall("Вероника");
    phone3.receiveCall("Евгений");

    phone1.receiveCall("Павел", "+375173286264");
    phone2.receiveCall("Вероника", "+375173214546");
    phone3.receiveCall("Евгений", "+375172231421");

    phone1.sendMessage("+375291909999", "+375253142723", "+375253445523");
    phone2.sendMessage("+37529234291");
  }
}
