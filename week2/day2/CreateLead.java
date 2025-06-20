package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the Browser
		EdgeDriver driver=new EdgeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	         
         //Enter the password
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         
         //Click on the Login button -click()
         driver.findElement(By.className("decorativeSubmit")).click();
         
         //Click the crmsfa link
         driver.findElement(By.linkText("CRM/SFA")).click();
         
         //Click on the Leads
         driver.findElement(By.linkText("Leads")).click();
         
         //Click on the CreateLead link
         driver.findElement(By.linkText("Create Lead")).click();
         
         //Enter the companyname
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
         
         //Enter the firstname
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deebika");
         
         //Enter the lastname
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Govindharajan");
         
         //Enter the Title
         driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms.");
         
         //Click on CreateLead button
         driver.findElement(By.name("submitButton")).click();
         
     	 //Get the Title name
              
         String pageTitle = driver.getTitle();
         System.out.println("Page Title: " + pageTitle);

 		//Verify that the Title is displayed correctly.

        if (pageTitle.equalsIgnoreCase("View Lead | opentaps CRM")) 
        	System.out.println("Title matches the expected value.");

        else
        	System.out.println("Title does not match with the expected value.");


		 //Close the browser window.
		 driver.close();

	}

}
