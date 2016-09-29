
public class Book {
	
	//Due Date will be printed out in array 
	
	public String title;
	public String author;
	public String keyword;
	public String book;
	
	
//	public Book(){
//		this.book =
//	}
	
	public String getTitle(String t){
		return title;
	}
	public String getAuthor(String a){
		return author;
	}
	public String getKeyword(String k){
		return keyword;
	}
	
	
	public static String printBookList(){
		for(int i=0; i<bookList.length;i++){
			
			for (int j = 0; j < bookList[i].length; j++){
		
			
			System.out.println(bookList[i][j]);
				  
			}
			
		}
		return null;
		
		
		
	}
	
	
	public static String [] [] bookList = new String [14] [0];{
		bookList [0][0] = "Title: Guilty Pleasers \n Author: Laurell K. Hamilton";
		bookList [1][0] = "Title: Laughing Corpse \n Author: Laurell K. Hamilton";
		bookList [2][0] = "Title: Circus of the Damned \n Author: Laurell K. Hamilton";
		bookList [3][0] = "Title: The Lunatic Cafe \n Author: Laurell K. Hamilton";
		bookList [4][0] = "Title: Bloody Bones \n Author: Laurell K. Hamilton";
		bookList [5][0] = "Title: The killing Dance \n Author: Laurell K. Hamilton";
		bookList [6][0] = "Title: Enders Game \n Author:";
		bookList [7][0] = "Title: \n Author:";
		bookList [8][0] = "Title: \n Author:";
		bookList [9][0] = "Title: \n Author:";
		bookList [10][0] = "Title: \n Author:";
		bookList [11][0] ="Title: \n Author:";
		bookList [12][0] ="Title: \n Author:";
		bookList [13][0] ="Title: \n Author:";
		bookList [14][0] ="Title: \n Author:";
		
				
		
	}
}
