package _06_Hospital;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Hospital {
	private ArrayList<Doctor> doctors;
	private ArrayList<Patient> patients;
	private int whichDoctor = 0;

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

	public void whichDoctor(int whichDoctor) {
		this.whichDoctor = whichDoctor;
	}

	public int theDoctor() {
		return whichDoctor;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors(int docs, int pats) throws DoctorFullException {
		for(int i = 0; i < docs; i++) {
			doctors.add(new GeneralPractitioner());
		}for(int i = 0; i < pats; i++) {
			patients.add(new Patient());
		}
		//System.out.println(patients.size());
		//System.out.println(doctors.size());
		
		
		
		if (docs * 3 < pats) {
			JOptionPane.showMessageDialog(null, "There are too many patients");
		} else {
			for(int i = 0; i < docs; i++) {
				
				for(int k = 0; k < 3; k++) {
					int number = k + (3*i);
					System.out.println(number);
					if(number >= patients.size()) {
					break;
					}else {
						doctors.get(i).assignPatient(patients.get(number));
					}
				}
			}
		}
	}

	public static void testDoctors() {
		// for() Doctors can only handle three patients exception
	}
}
