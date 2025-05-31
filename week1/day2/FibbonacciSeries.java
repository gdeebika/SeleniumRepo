package week1.day2;

//The Fibbonacci series is a sequence of numbers where each number is the sum of the two preceding ones
// usually starting with 0 and 1. 
//The sequence follows the pattern: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0, n2=1;
		
		System.out.println("FibbonacciSeries:\n" +n1+ "\n"  +n2);
		
		for (int i=1; i<6; i++)
		{
			int n3=n1+n2;
			System.out.println(+n3);
			n1=n2;
			n2=n3;
		}

	}

}
