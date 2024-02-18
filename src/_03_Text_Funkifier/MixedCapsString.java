package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		StringBuilder bob = new StringBuilder(unfunkifiedText);
		for(int i = 0; i < unfunkifiedText.length(); i++) {
			if(i%2 == 0) {
				bob.setCharAt(i, Character.toLowerCase(unfunkifiedText.charAt(i)));
			}else {
				bob.setCharAt(i, Character.toUpperCase(unfunkifiedText.charAt(i)));
			}
			
		
		}
		
		return bob.toString();
	}

}
