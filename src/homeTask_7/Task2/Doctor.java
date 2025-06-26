package homeTask_7.Task2;

abstract class Doctor {
  protected String name;

  public Doctor(String name) {
    this.name = name;
  }

  public abstract void treat(Patient patient);
}
