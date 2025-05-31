package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int input= 12121, output=0, rem=0;

		
		for (int i=12121; i>0; i= i/10)
		{
			
			rem = i%10;
			output= (output * 10) + rem;
		}
		
		System.out.println("Reversed Number is " +output);
		
		if (output==input) {
			
			System.out.println("Given Number is Palindrome");
			
		}
		else {
			
			System.out.println("Given Number is not Palindrome");
			
		}


		
		}

	}


