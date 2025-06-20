package week3.day2;

public class Safari extends Browser {

public void readerMode() {
		
		System.out.println("Open in Reader mode");		
	}

	
	public void fullScreenMode() {
		
		System.out.println("Open in Full Screen mode");	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari safariBrowser= new Safari();
		safariBrowser.openURL();
		safariBrowser.closeBrowser();
		safariBrowser.navigateBack();
		safariBrowser.readerMode();
		safariBrowser.fullScreenMode();

	}

}
