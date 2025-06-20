package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegistrationProcess {

	public static void main(String[] args) {

				ChromeDriver webpage=new ChromeDriver();

				webpage.get("https://en-gb.facebook.com/");

				webpage.manage().window().maximize();
				
				webpage.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
								
				//Click on the Create new account button.
				webpage.findElement(By.linkText("Create new account")).click();
				//Enter the First name.
				webpage.findElement(By.name("firstname")).sendKeys("TESTFIRST");
				//Enter the Surname.
				webpage.findElement(By.name("lastname")).sendKeys("TESTLAST");
				//Enter the Mobile number or email address.
				webpage.findElement(By.name("reg_email__")).sendKeys("testleaf.2023@gmail.com");
				//Enter the New password.
				webpage.findElement(By.id("password_step_input")).sendKeys("Tuna@321");
				//Handle all three dropdowns in Date of birth
				WebElement dayDrop = webpage.findElement(By.id("day"));
				Select day=new Select(dayDrop);
				day.selectByIndex(8);
				
				WebElement monthDrop = webpage.findElement(By.id("month"));
				Select month=new Select(monthDrop);
				month.selectByVisibleText("Aug");
				
				WebElement yearDrop = webpage.findElement(By.id("year"));
				Select year=new Select(yearDrop);
				year.selectByValue("1990");
				//Select the radio button in Gender.
				WebElement radioButton =webpage.findElement(By.xpath("//label[contains(text(),'Custom')]/input[@id='sex']"));
				//WebElement radioButton =webpage.findElement(By.xpath("//input[@value='-1']"));
				radioButton.click();
				boolean isSelected = radioButton.isSelected();

				 if (isSelected) {
				       System.out.println("Radio button is selected");
				   } else {
				       System.out.println("Radio button is not selected");
				   }
				//Close the browser window.
				webpage.close();


	}

}
