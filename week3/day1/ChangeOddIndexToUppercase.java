package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
	
		
		String test="changeme";
		
		char[] t1Array = test.toCharArray();
		
		//System.out.println(t1Array);
		
		for (int i=0; i< t1Array.length; i++)
		{
			if (i%2!=0) 
			{
				t1Array[i]= Character.toUpperCase(t1Array[i]);
			
	        }
		}
			
		System.out.println(t1Array);
		
}
}
