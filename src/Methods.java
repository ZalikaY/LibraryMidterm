
public class Methods {

	public static String[] [] bookListArray() {
		
		String [] [] bookList = new String [15] [1];
		
	 
		bookList [0] [0] = "Title: Guilty Pleasers \n Author: Laurell K. Hamilton";
		bookList [1] [0] = "Title: Laughing Corpse \n Author: Laurell K. Hamilton";
		bookList [2] [0] = "Title: Circus of the Damned \n Author: Laurell K. Hamilton";
		bookList [3] [0] = "Title: The Lunatic Cafe \n Author: Laurell K. Hamilton";
		bookList [4] [0] = "Title: Bloody Bones \n Author: Laurell K. Hamilton";
		bookList [5] [0] = "Title: The killing Dance \n Author: Laurell K. Hamilton";
		bookList [6] [0] = "Title: Enders Game \n Author:";
		bookList [7] [0] = "Title: \n Author:";
		bookList [8] [0] = "Title: \n Author:";
		bookList [9] [0] = "Title: \n Author:";
		bookList [10] [0] = "Title: \n Author:";
		bookList [11] [0] ="Title: \n Author:";
		bookList [12] [0] ="Title: \n Author:";
		bookList [13] [0] ="Title: \n Author:";
		bookList [14] [0] ="Title: \n Author:";
		
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
	
	
	

