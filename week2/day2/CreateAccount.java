package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the Browser
				EdgeDriver webpage=new EdgeDriver();
				webpage.get("http://leaftaps.com/opentaps/");
				webpage.manage().window().maximize();
				//add implicit wait
				webpage.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Find the username
				webpage.findElement(By.id("username")).sendKeys("Demosalesmanager");
				//webpage.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				
				//Find the Password
				webpage.findElement(By.id("password")).sendKeys("crmsfa");
				//webpage.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				
				//Find the Button
				webpage.findElement(By.className("decorativeSubmit")).click();
				
				//Click the crmsfa link
				webpage.findElement(By.linkText("CRM/SFA")).click();
				
				//Click the Accounts tab
				webpage.findElement(By.linkText("Accounts")).click();
				
				//Click on the Create Account link
				webpage.findElement(By.linkText("Create Account")).click();
				
				//Enter account name.
				webpage.findElement(By.id("accountName")).sendKeys("Selenium Assignment Create");
				String enteredAccountName = webpage.findElement(By.id("accountName")).getAttribute("value");
				System.out.println("Entered Description in the Account Name Field is " +enteredAccountName);
				
				//Select "ComputerSoftware" as the industry.
				WebElement industryDrop = webpage.findElement(By.name("industryEnumId"));
				Select industry=new Select(industryDrop);
				industry.selectByValue("IND_SOFTWARE");
		         
				//Select "S-Corporation" as ownership using SelectByVisibleText.
				WebElement ownershipDrop = webpage.findElement(By.name("ownershipEnumId"));
				Select ownership=new Select(ownershipDrop);
				ownership.selectByVisibleText("S-Corporation");
				
				//Select "Employee" as the source using SelectByValue.
				WebElement sourceDrop = webpage.findElement(By.id("dataSourceId"));
				Select source=new Select(sourceDrop);
				source.selectByValue("LEAD_EMPLOYEE");
				
				//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
				WebElement markcampDrop = webpage.findElement(By.id("marketingCampaignId"));
				Select marketing_campaign=new Select(markcampDrop);
				marketing_campaign.selectByIndex(6);
				
				//Select "Texas" as the state/province using SelectByValue.
				WebElement stateDrop = webpage.findElement(By.id("generalStateProvinceGeoId"));
				Select state=new Select(stateDrop);
				state.selectByValue("TX");
				
				//Click the "Create Account" button.
				webpage.findElement(By.className("smallSubmit")).click();
				
				//Verify that the account name is displayed correctly.
				//String accountName= webpage.findElement(By.xpath("//span[contains(text(),'Selenium')]")).getText();
				//String alphabeticString = accountName.replaceAll("[^a-zA-Z ]", "");

				
				String accountName= webpage.findElement(By.xpath("//span[text()='Account Name']//following::span[1]")).getText();
				
				String alphabeticString = accountName.replaceAll("[\\d()]", "");
				
				System.out.println("Account Name displayed after creating account is " +alphabeticString);
				 
				if (alphabeticString.contains(enteredAccountName))
					System.out.println("Account Name is displayed as given");
				else 
					System.out.println("Account Name is not displayed as given");
				
				//Close the browser window.
				webpage.close();

	}

}
