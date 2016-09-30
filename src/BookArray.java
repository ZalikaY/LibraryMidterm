import java.util.ArrayList;
public class BookArray {


	//books.add(new Book("Harry Potter", "J.K. Rowling"));

	public static ArrayList<Book>  books() {
		

		ArrayList<Book> books = new ArrayList<Book>();
	 
		books.add(new Book(" Guilty Pleasers", " Laurell K. Hamilton"));
		books.add(new Book(" Laughing Corpse" , "Laurell K. Hamilton"));
		books.add(new Book(" Circus of the Damned", "Laurell K. Hamilton"));
		books.add(new Book(" The Lunatic Cafe", "Laurell K. Hamilton"));
		books.add(new Book(" Bloody Bones", "Laurell K. Hamilton"));
		books.add(new Book(" The killing Dance", "Laurell K. Hamilton"));
		books.add(new Book(" Enders Game", "Orson Scott Clark"));
		books.add(new Book(" Harry Potter", "JK Rowlins"));
		books.add(new Book(" Minion", "L.A Banks"));
		books.add(new Book(" The Awakening", "L.A Banks"));
		books.add(new Book(" The Hunted", "L.A Banks"));
		books.add(new Book(" The Bitten", "L.A Banks"));
		books.add(new Book(" The Color Purple", "Alice Walker"));
		books.add(new Book(" What was he thinking?", "Leroy Johnson"));
		books.add(new Book(" A day in the life" , "Andre 3000"));
		
		for(Book book : books){
			
			System.out.println(book.getTitle() + "\t" + book.getAuthor());
	
		
		}
		return books;
			
		}
	
/*public static void  CheckInOrOut(){
	
	
	if(in){
		System.out.println("This book is available to the check out");
	}else{
		System.out.println("This book is not availible to check out" + "This book will be available: "+ Date);
	}
} */
	}

	

		
		
	
	
	
	

