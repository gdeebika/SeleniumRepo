package week2.day1;

public class Browser {
	
	public String launchBrowser() {
		String comments ="Browser launched successfully";
		return comments;
		
	}
	
	public void loadUrl() {
		System.out.println("URL loaded successfully");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser browserLaunch = new Browser();
		String returnedValue= browserLaunch.launchBrowser();
		System.out.println(returnedValue);
		browserLaunch.loadUrl();
		
	}

}


