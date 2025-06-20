package week3.day1;


public class PrintDuplicatesNestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] num= {2,5,7,7,5,9,2,3};
				
		int lengthofArrays = num.length;
		
		for (int i=0; i< lengthofArrays-1; i++)
	
		{
			for (int j=i+1; j<lengthofArrays-1; j++ )
			{
				if (num[i]==num[j])
				{
				System.out.println("The duplicates are: " +num[i]);
				}
				
		}
		
		

	}

}



}
