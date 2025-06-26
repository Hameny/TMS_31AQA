package homeTask_7.Task2;

public class Clinic {

  private Surgeon surgeon;
  private Therapist therapist;
  private Dentist dentist;

  public Clinic() {
    this.surgeon = new Surgeon("Пилецкий Иван");
    this.therapist = new Therapist("Карпицкий Петр");
    this.dentist = new Dentist("Синичкина Анна");
  }

  public void prescribeAndTreat(Patient patient) {
    TreatmentPlan plan = patient.getTreatmentPlan();

    if (plan == null) {
      System.out.println("У пациента нет плана лечения");
      return;
    }

    switch (plan.getCode()) {
      case 1:
        surgeon.treat(patient);
        break;
      case 2:
        dentist.treat(patient);
        break;
      default:
        therapist.treat(patient);
        break;
    }
  }
}