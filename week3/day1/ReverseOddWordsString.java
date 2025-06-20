package week3.day1;

public class ReverseOddWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		//Expected output: “I ma a erawtfos tester”
		String reversedStr = "";
		String[] split= test.split(" ");
		
		for (int i=0; i< split.length; i++)
		{
			
			if (i%2!=0) 
			{
				char[] tArray = split[i].toCharArray();
			
	       			for (int j=tArray.length-1; j >=0; j--)
	       			{
			       				reversedStr = reversedStr+tArray[j];
	       				
	       			}
	       			System.out.print(reversedStr);
			}
			
			else 
			{
				System.out.print(split[i]);
			}

			System.out.print(" ");
	}

}
}
