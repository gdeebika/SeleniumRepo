package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
	
		
		if(text1.length()==text2.length())
		{
					
			char[] t1Array = text1.toCharArray();
			char[] t2Array = text2.toCharArray();
		     
			System.out.println(t1Array);
			System.out.println(t2Array);
			
			Arrays.sort(t1Array);
			Arrays.sort(t2Array);
			
					
			if(Arrays.equals(t1Array, t2Array))
			{
				System.out.println("The given strings are Anagram");
				
			}
			
			else
			{
				System.out.println("The given strings are not an Anagram");

	}
		}
		else
		
		System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	
}
}
