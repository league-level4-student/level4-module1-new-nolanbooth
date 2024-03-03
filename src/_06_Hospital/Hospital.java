package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;

	public Hospital() {
		doctors = new ArrayList<>();
		patients = new ArrayList<>();

	}

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public void assignPatientsToDoctors(int docs, int pats) {
		
		
	}public static void testDoctors() {
		//for() Doctors can only handle three patients exception
	}
}
