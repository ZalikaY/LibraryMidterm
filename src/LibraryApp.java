import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		String option = " ";
		String returnOption;

		
	Scanner input = new Scanner(System.in);
		//Welcome user 
		System.out.println("Welcome to the Library App");
		System.out.println("Would you like to return book or check out a book? (return/check out)");
		option = input.nextLine();
		
		if(option.equalsIgnoreCase("return")){
			
			System.out.println("Thank you for returning you book!");
			
			System.out.println("Would you like to check out another book? (enter y/n)");
			
			returnOption = input.nextLine();
			
			if(returnOption.equalsIgnoreCase("y")){
				
				CheckOut.printOutListOfBooks();
				CheckOut.searchChoice();
				
				
			}else{
				System.exit(1);
			}
			}else{
				
			CheckOut.printOutListOfBooks();
			CheckOut.searchChoice();
			
		}
		//Book newBookSelection = new Book(choice);
	
		
		
		
		

	}

}
