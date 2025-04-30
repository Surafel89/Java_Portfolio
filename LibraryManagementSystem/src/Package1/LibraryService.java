package Package1;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
	static Book book;
	 List <Book>books=new ArrayList<>();
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added ");
	}
 public void viewBooks() {
	 
	 if(books.isEmpty()) {
		
		 System.out.println("No books in the Libray");}
	 for(Book book:books) {
		
		 System.out.println(book.getAuthor());
		 System.out.println(book.getavailablecopies());
		 System.out.println(book.getttitle());
		 System.out.println(book.gettotalavailablecopies());
	 }
 }

 
 public void borrowBook(String title) {
	
		 for(Book book:books) {
			 if(book.getttitle().equalsIgnoreCase(title)) {
				if(book.gettotalavailablecopies()>0) {
					
				book.settotalavailablecopies(book.gettotalavailablecopies()-1);
					System.out.println("Book borrowed successfully");
				
				}
				else {
					System.out.println("Book out of stock");
				}
				
				return;}
				System.out.println("Book not available ");}
			 
		 }
 
 public void returnBook(String title) {
	 for(Book book:books) {
		 if(book.getttitle().equalsIgnoreCase(title)) {
			 book.setavaiablecopies(book.getavailablecopies()+1);
			 System.out.println("Book returned successfully");
		 }
		 
			 return;
		 }
	
		 System.out.println("Book not available");
		 
	 }

public boolean isBookInLibarary(String title) {
	boolean isavailable=true;
	
	
	for(Book book:books) {
	
	
	if(book.getttitle().equalsIgnoreCase(title)) {
	
	isavailable=true;
	
}	
	else {
		isavailable=false;
	}
}
	return isavailable;
	} 
}	 
		 
 
 

	


