package homeTask_7.Task2;

public class Surgeon extends Doctor{
  public Surgeon(String name) {
    super(name);
  }

  @Override
  public void treat(Patient patient) {
    System.out.println("Хирург " + name + " лечит пациента " + patient.getName());
    System.out.println("Лечение:");
    System.out.println("Ежедневно делать перевязки раны");
  }
}
