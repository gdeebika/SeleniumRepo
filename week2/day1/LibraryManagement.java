//Class objects can be created within the main method of the same class as well as in a different class.
package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library manageLibrary = new Library();
		
		manageLibrary.addBook("JAVA");
		manageLibrary.issueBook();
		
		

	}

}
