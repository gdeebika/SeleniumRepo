package week3.day2;

public class TestData {
	
	public void enterCredentials() {
		
		System.out.println("Credentials are entered");		
	}

	
	public void navigateToHomePage() {
		
		System.out.println("Navigated to Home Page");		
	}


	public static void main(String[] args) {
		
		TestData testDetails = new TestData();
		testDetails.enterCredentials();
		testDetails.navigateToHomePage();
	}

}
