package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateFacebookLogin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the Browser
		EdgeDriver webpage=new EdgeDriver();
		
		//Load the Url
		webpage.get("https://www.facebook.com");
		
		//Maximize the browser
		webpage.manage().window().maximize();
		
		//Find the Email (login)
		//Find the Element - findElement()
		//Enter the value in a text field - sendKeys()
		
		webpage.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//Find the Password
		
		webpage.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		
		//Find the Button
		
		webpage.findElement(By.name("login")).click();
		
		
		

	}

}
