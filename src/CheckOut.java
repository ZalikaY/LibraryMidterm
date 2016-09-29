import java.util.Scanner;

public class CheckOut {
	
	static Scanner input = new Scanner(System.in);
	
	private static String findType;
	public static String userInput;
	public static String choice;
	public static String titleOrAuthor;
	
public static void printOutListOfBooks(){
		
		System.out.println("Here is a list of the books");

			Methods.printBookList();

	}

public static String searchChoice(){

	System.out.println("Based on the list what book would you like. \nPlease enter if you want to search by Title or Author");
	userInput = input.nextLine();
	
	if(userInput.equalsIgnoreCase("title"))
	{
		System.out.println("Please enter a title: ");
		findType = input.nextLine();

	}else if(userInput.equalsIgnoreCase("author"))
	{
		System.out.println("Please enter a author: ");
		findType = input.nextLine();
	
	}
	 choice = findType;
	
	return choice;
}



}
