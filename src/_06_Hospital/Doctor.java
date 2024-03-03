package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	private ArrayList<Patient> numberOfPatients;
	protected boolean performsSurgery;
	protected boolean makesHouseCalls;

	public Doctor() {
		numberOfPatients = new ArrayList<>();
		performsSurgery = false;
		makesHouseCalls = false;

	}

	public void assignPatient(Patient patient) {
		numberOfPatients.add(patient);

	}

	public ArrayList<Patient> getPatients() {
		return numberOfPatients;
	}

	public void doMedicine() {
		for (int i = 0; i < numberOfPatients.size(); i++) {
			numberOfPatients.get(i).setFeelsCaredFor(true);
		}
	}
}

class GeneralPractitioner extends Doctor {
	public GeneralPractitioner() {
		performsSurgery = false;
		makesHouseCalls = true;
	}

	public boolean makesHouseCalls() {
		return makesHouseCalls;
	}

	public boolean performsSurgery() {
		return performsSurgery;
	}

}

class Surgeon extends Doctor {
	public Surgeon() {
		performsSurgery = true;
		makesHouseCalls = false;
	}

	public boolean makesHouseCalls() {
		return makesHouseCalls;
	}

	public boolean performsSurgery() {
		return performsSurgery();
	}
}
