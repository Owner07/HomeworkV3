package HomeWork5;

public class Therapist extends Doctor {

    @Override
    public void heal() {
        System.out.println("Назначен врач: Терапевт");
    }

    public void assignDoctor(Patient patient) {
        if (patient.planHeal == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.heal();
            patient.doctor = surgeon;
        } else if (patient.planHeal == 2) {
            Dentist dentist = new Dentist();
            dentist.heal();
            patient.doctor = dentist;
        } else {
            Therapist therapist = new Therapist();
            therapist.heal();
            patient.doctor = therapist;
        }
    }
}