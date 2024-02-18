package _03_Text_Funkifier;

public class BingusMingus implements TextFunkifier{
	private String unfunkifiedText;
	
	
	public BingusMingus(String unfunkifiedText) {
		this.unfunkifiedText = unfunkifiedText;
	}
	@Override
	public String funkifyText() {
		
		return "bingus";
	}

}
