package week4.homeassignment.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("a-button-text")).click();
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("phones");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		search.submit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//driver.findElement(By.id("a-autoid-0-announce")).click();
		//driver.findElement(By.linkText("Price: Low to High")).click();
		
		//Write common locator / xpath matching all the phone price in the page and get into List<Element>
		//Get the values in a list and sort the values in ascending order
		//Get the first item from the sorted list which is the least price
		List<WebElement> priceOfPhones = driver.findElements(By.className("a-price-whole"));

		// To count the number of phones
				int numberOfPhones = priceOfPhones.size();
				System.out.println(numberOfPhones);

				List<Integer> allPhones = new ArrayList<Integer>();

				// for loop to print the values
				for (int i = 0; i < numberOfPhones; i++) {
					String text = priceOfPhones.get(i).getText();
					System.out.println(text);
				}

				// for each loop to print the values
				for (WebElement eachPrice : priceOfPhones) {
					String price = eachPrice.getText().replace(",", "");
					allPhones.add(Integer.parseInt(price));
				}
				System.out.println(allPhones);
				
				Collections.sort(allPhones);
				System.out.println("The List after sorting: " + allPhones);
				
				int leastPrice = allPhones.get(0);
				System.out.println("The leastPrice is: " + leastPrice);
	}

}
