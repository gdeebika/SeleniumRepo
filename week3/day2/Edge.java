package week3.day2;

public class Edge extends Browser {

public void takeSnap() {
		
		System.out.println("Take the Snapshot");		
	}

	
	public void clearCookies() {
		
		System.out.println("Clear the cookies from Browser");	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edge edgeBrowser= new Edge();
		edgeBrowser.openURL();
		edgeBrowser.closeBrowser();
		edgeBrowser.navigateBack();
		edgeBrowser.takeSnap();
		edgeBrowser.clearCookies();

	}

}
