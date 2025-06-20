package week3.day1;

import java.util.Arrays;

public class FindingMissingelementonarray {
	
	public static void main(String[] args) {

	int a[]={1,4,3,2,8,6,7};
	
	Arrays.sort(a);
	for (int i=0; i< a.length; i++)
					
	{ 
						if (a[i]!=i+1)
						
			{
							int missingnumber= i+1;
							System.out.println("The missingnumber are: " +missingnumber);
							break;
		
			}							
		}
	}
}