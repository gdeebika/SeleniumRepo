package week3.day2;

public class BasePage {
	public void findElement() {
				System.out.println("Element is found");		
	        }
	public void clickElement() {
				System.out.println("Click action is performed on the element");	
			}
	public void enterText() {
		System.out.println("Text is Entered");	
	}
	public void performCommonTasks(String tasks) {
		System.out.println("Common tasks are performed " + tasks);	
	}
	
	public static void main(String[] args) {
		BasePage basePageOptions=new BasePage();
		basePageOptions.performCommonTasks("basepagetask");
	}

}
