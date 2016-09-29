import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		//Declarations
		String pList;
		boolean proceed = true;
		String userInput;
		
		//Objects
		Scanner input = new Scanner(System.in);
		
		//Welcome user 
		System.out.println("Welcome to the Library App \nWhere you can check out and return books!\n");
		
		System.out.println("Would you like to view the a list of books we have in inventory? (Enter y/n)");
		 pList = input.nextLine();
		 
		 
		 while(proceed){
			 
		 if(pList.equalsIgnoreCase("y")){
			 
			Methods.printBookList();
			 
			 proceed = false;
			 
		 }else{
			 System.out.println("Are you sure? You can't select a book with out seeing the list.");
			 
			 pList = input.nextLine();
			 
			 proceed = true;
		 }
		 }
		 
		 System.out.println("Based on the list what book would you like. \nPlease enter if you want to search by Title or Author");
		 	userInput = input.nextLine();
		
		
		Book newBookSelection = new Book(userInput);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
