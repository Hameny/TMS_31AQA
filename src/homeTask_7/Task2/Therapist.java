package homeTask_7.Task2;

public class Therapist extends Doctor{
  public Therapist(String name) {
    super(name);
  }

  @Override
  public void treat(Patient patient) {
    System.out.println("Терапевт " + name + " лечит пациента " + patient.getName());
    System.out.println("Лечение:");
    System.out.println("Полоскать горло и принимать таблетки 3 раза в день");
  }
}
