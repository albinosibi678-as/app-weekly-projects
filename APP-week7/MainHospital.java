import doctor.Doctor;
import patient.Patient;

public class MainHospital {
    public static void main(String[] args) {
        Doctor[] doctors = new Doctor[2];
        doctors[0] = new Doctor(1, "Ramesh", "Cardiology", 800);
        doctors[1] = new Doctor(2, "Kavya", "Orthopedics", 600);

        Patient[] patients = new Patient[3];
        patients[0] = new Patient(101, "Arun", "Heart Disease", 45);
        patients[1] = new Patient(102, "Sneha", "Fracture", 25);
        patients[2] = new Patient(103, "Kiran", "Heart Disease", 50);

        String[] assignedDoctorSpecialization = new String[3];
        assignedDoctorSpecialization[0] = "Cardiology";
        assignedDoctorSpecialization[1] = "Orthopedics";
        assignedDoctorSpecialization[2] = "Cardiology";

        for (int i = 0; i < patients.length; i++) {
            Doctor assignedDoctor = null;
            for (int j = 0; j < doctors.length; j++) {
                if (doctors[j].getSpecialization().equals(assignedDoctorSpecialization[i])) {
                    assignedDoctor = doctors[j];
                    break;
                }
            }

            patients[i].displayPatientDetails();
            assignedDoctor.displayDoctorDetails();
            assignedDoctor.addPatient();
            System.out.println();
        }

        for (int i = 0; i < doctors.length; i++) {
            System.out.println("Dr. " + doctors[i].getName() + " Total Consultation Fee Collected: ₹" + doctors[i].getTotalFeeCollected());
        }
    }
}
