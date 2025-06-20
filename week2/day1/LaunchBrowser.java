package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the Browser
				ChromeDriver webpage=new ChromeDriver();
				
				//Load the Url
				webpage.get("https://www.facebook.com");
				
				//Maximize the browser
				webpage.manage().window().maximize();
				
				//Close the browser
				webpage.close();

	}

}
