package week3.day2;

public class LoginPage extends BasePage {
	
	public void performCommonTasks(String tasks) {
		super.performCommonTasks(tasks);
		System.out.println("Common tasks are Overridden and performed  " + tasks);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage pageOptions=new LoginPage();
		pageOptions.performCommonTasks("https://body");
		pageOptions.findElement();
		pageOptions.clickElement();
		pageOptions.enterText();

	}

}
