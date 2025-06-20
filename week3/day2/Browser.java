package week3.day2;

public class Browser {
	
	public void openURL() {
		
		System.out.println("URL is launched");		
	}

		public void closeBrowser() {
		
		System.out.println("Browser is closed");	
	}
	
	public void navigateBack() {
		
		System.out.println("Navigate back to the Browser");	
		
	}
	public static void main(String[] args) {
		
		Browser browserOptions = new Browser();
		browserOptions.openURL();
		browserOptions.closeBrowser();
		browserOptions.navigateBack();
	}

}
