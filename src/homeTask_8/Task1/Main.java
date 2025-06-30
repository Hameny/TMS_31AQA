package homeTask_8.Task1;

public class Main {

  public static void main(String[] args) {

    Figura[] figures = new Figura[5];

    figures[0] = new Triangle(3, 4, 5);

    figures[1] = new Rectangle(4, 6);

    figures[2] = new Circle(5);

    figures[3] = new Triangle(6, 8, 10);

    figures[4] = new Circle(3);

    double totalPerimeter = 0;
    for (
        Figura figura : figures) {
      totalPerimeter += figura.getPerimeter();
    }

    System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
  }
}
