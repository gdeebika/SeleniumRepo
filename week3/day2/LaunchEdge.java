//MethodOverriding
package week3.day2;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge extends LaunchChrome {

	public void launch() {
		super.launch();
		EdgeDriver driver=new EdgeDriver();
		//System.out.println("Edge is launched");

	}
	
	public static void main(String[] args) {
		LaunchEdge browserOptions=new LaunchEdge();
		browserOptions.launch();
	}

}
