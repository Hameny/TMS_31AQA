package homeTask_7.Task2;

public class Main {
  public static void main(String[] args) {
    Patient patient = new Patient("Алексей");
    TreatmentPlan plan = new TreatmentPlan(
        1);
    patient.addTreatmentPlan(plan);
    Clinic clinic = new Clinic();
    clinic.prescribeAndTreat(patient);

    Patient secondPatient = new Patient("Мария");
    secondPatient.addTreatmentPlan(new TreatmentPlan(3));
    clinic.prescribeAndTreat(secondPatient);
  }
}
