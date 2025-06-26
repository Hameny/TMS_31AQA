package homeTask_7.Task2;

public class Dentist extends Doctor {

  public Dentist(String name) {
    super(name);
  }

  @Override
  public void treat(Patient patient) {
    System.out.println("Дантист " + name + " лечит пациента " + patient.getName());
    System.out.println("Лечение:");
    System.out.println("Удаление 1 зуба срочно");
    System.out.println("Лечение кариеса после удаления зуба");
  }
}
