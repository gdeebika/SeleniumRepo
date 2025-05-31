package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 7;
		boolean result= true;
		
		for (int i=2; i<n; i++)
		{
			if (n%i==0)
			{ result = false;
			break;
			}
			
		}
		if (result)
				
			{System.out.println(n+" is a prime number");
			
			}
			else 
			{
				
				System.out.println(n+" is not a prime number");
			}
		}


}
