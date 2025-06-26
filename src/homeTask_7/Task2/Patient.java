package homeTask_7.Task2;

public class Patient {
  private String name;
  private TreatmentPlan treatmentPlan;

  public Patient(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addTreatmentPlan(TreatmentPlan treatmentPlan) {
    this.treatmentPlan = treatmentPlan;
  }

  public TreatmentPlan getTreatmentPlan() {
    return treatmentPlan;
  }
}
