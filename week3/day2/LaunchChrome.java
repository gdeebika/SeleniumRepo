//MethodOverriding in Java occurs when a subclass has a method with the same name, return type, and parameters as a method in its superclass.
package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public void launch() {
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Chrome is launched");

	}

}
