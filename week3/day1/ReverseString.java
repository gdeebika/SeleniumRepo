package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		String companyName= "TestLeaf";
		char[] charArray = companyName.toCharArray();
		String reversedStr = "";
		char[] reverseArray = new char[charArray.length];
		
		//Implementation 1
		for (int i=charArray.length-1; i >=0; i--)
		{
			reversedStr = reversedStr+charArray[i];
			
		}
		
		System.out.println(reversedStr);
		
		//Implementation 2
		for (int i=0; i< charArray.length; i++)
		{
			//reversedStr = charArray[i] + reversedStr;
			
			reverseArray[i] = charArray[charArray.length - i-1 ];
			
			}
		
		//System.out.println(reversedStr);
		System.out.println(new String(reverseArray));

	}

}
