package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{

	
	public void scaryPopup() {
		JOptionPane.showMessageDialog(null, "hehehehaw you have triggered a virus");
	}
	
	
}
