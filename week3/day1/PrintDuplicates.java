package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {2,5,7,7,5,9,2,3};
		Arrays.sort(num);
		//System.out.println("The lowest numbers is: " +num[0]);
		
		int lengthofArrays = num.length;
		
		for (int i=0; i< lengthofArrays-1; i++)
		//	for (int i=0; i< num.length; i++)
		{
			if (num[i]==num[i+1])
			{
				System.out.println("The duplicates are: " +num[i]);
				
		}
		
		

	}

}
}
