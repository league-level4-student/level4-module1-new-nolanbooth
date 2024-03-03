package _06_Hospital;

public class Patient {
	private int pulse;
	private boolean feelsCaredFor;
	
	public Patient() {
		pulse = 0;
		feelsCaredFor = false;
	}
	
	public void setPulse(int pulse) {
		this.pulse = pulse;
	}
	public int checkPulse() {
		return pulse;
		
		
	}public void setFeelsCaredFor(boolean feelsCaredFor) {
		this.feelsCaredFor = feelsCaredFor;
	}
	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}
	
	
}
