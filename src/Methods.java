
public class Methods {

	public static String[] [] bookListArray() {
		
		String [] [] bookList = new String [15] [1];
		
	 
		bookList [0] [0] = "Title: Guilty Pleasers \n Author: Laurell K. Hamilton";
		bookList [1] [0] = "Title: Laughing Corpse \n Author: Laurell K. Hamilton";
		bookList [2] [0] = "Title: Circus of the Damned \n Author: Laurell K. Hamilton";
		bookList [3] [0] = "Title: The Lunatic Cafe \n Author: Laurell K. Hamilton";
		bookList [4] [0] = "Title: Bloody Bones \n Author: Laurell K. Hamilton";
		bookList [5] [0] = "Title: The killing Dance \n Author: Laurell K. Hamilton";
		bookList [6] [0] = "Title: Enders Game \n Author: Orson Scott Clark";
		bookList [7] [0] = "Title: Harry Potter \n Author: JK Rowlins";
		bookList [8] [0] = "Title: Minion \n Author: L.A Banks";
		bookList [9] [0] = "Title: The Awakening \n Author: L.A Banks";
		bookList [10] [0] = "Title: The Hunted \n Author: L.A Banks";
		bookList [11] [0] = "Title: The Bitten \n Author: L.A Banks";
		bookList [12] [0] = "Title: The Color Purple \n Author: Alice Walker";
		bookList [13] [0] = "Title: What was he thinking? \n Author: Leroy Johnson";
		bookList [14] [0] = "Title: A day in the life \n Author: Andre 3000";
		
		return bookList;
}
public static void printBookList(){
		
		for(int i = 0; i <= bookListArray().length-1;i++){
			
			for (int j = 0; j < bookListArray()[i].length; j++){
				
					System.out.println(bookListArray()[i][j]);
			}
			System.out.println(" ");
		}
		return ;	
	}
		
	

		
		
	}
	
	
	

