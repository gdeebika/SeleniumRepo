package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		int count=0;
		String[] split= text.split(" ");
			
		for (int i=0; i< split.length; i++)
			{
			for (int j=i+1; j<split.length; j++ )
			{
				if (split[i].equalsIgnoreCase(split[j]))
				{
					split[j]= " ";
					count= count+1;
				}
			}
		}
				
		for (int i=0; i< split.length; i++)
		{
				System.out.println(split[i]+ " ");

}

	}

	}
