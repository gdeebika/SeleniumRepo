package week3.day2;
//Overloading: - It refers to the ability to create multiple methods of the same name with different implementations. 
public class MethodOverloadingCalculator  {
	// add, sub, mul, div
	// add
	// add 2 numbers - whole, Decimals
	// add 3 numbers... add n numbers
	// add two numbers
	public void addNumbers(int a, int b) {
		System.out.println(a + b);
	}
	// add 3 numbers
	public void addNumbers(int a, int b, int c) {
		System.out.println(a+b+c);
	}
    //add two decimals
	public void addNumbers(float a, float b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverloadingCalculator calcOptions=new MethodOverloadingCalculator();
		calcOptions.addNumbers(3, 4);
		calcOptions.addNumbers(2, 4, 6);
		calcOptions.addNumbers(2.5f, 5.5f);
	}
}
