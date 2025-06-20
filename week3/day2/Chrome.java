package week3.day2;

//ChromeOptions option =new ChromeOptions();
//option.addArguments("guest");
//ChromeDriver driver =new ChromeDriver(option);

public class Chrome extends Browser {
	
public void openIncognito() {
		
		System.out.println("Open in Incognito mode");		
	}

	
	public void clearCache() {
		
		System.out.println("Cache is cleared");	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome chromeBrowser= new Chrome();
		chromeBrowser.openURL();
		chromeBrowser.closeBrowser();
		chromeBrowser.navigateBack();
		chromeBrowser.openIncognito();
		chromeBrowser.clearCache();

	}

}
