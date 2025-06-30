package homeTask_8.Task2;

public class Main {
  public static void main(String[] args) {
    Positions director = new Director();
    Positions worker = new Worker();
    Positions accountant = new Accountant();

    director.printPositions();
    worker.printPositions();
    accountant.printPositions();
  }
}
