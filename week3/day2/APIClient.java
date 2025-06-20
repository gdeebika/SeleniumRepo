package week3.day2;
//Overloading Assignment
public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint + requestBody + requestStatus );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		APIClient apiOptions= new APIClient();
		apiOptions.sendRequest("https");
		apiOptions.sendRequest("https:", "//body ", true);

	}

}
