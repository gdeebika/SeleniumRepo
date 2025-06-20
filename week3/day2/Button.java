package week3.day2;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("Submit Action");		
    }
	
	public void setText(String text) {
		super.setText(text);
		System.out.println("Entered Text is:" +text);		
    }

}
