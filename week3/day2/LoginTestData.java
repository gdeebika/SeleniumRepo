package week3.day2;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		
		System.out.println("Enter the Username");		
	}

	
	public void enterPassword() {
		
		System.out.println("Enter the Password");		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData loginData = new LoginTestData();
		loginData.enterUsername();
		loginData.enterPassword();
		loginData.enterCredentials();
		loginData.navigateToHomePage();

	}

}
