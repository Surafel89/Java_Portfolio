package Package1;

import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		
		
		
	do {System.out.println("1. Add Book");
	System.out.println("2. View");
	System.out.println("3. Borrow Book");
	System.out.println("4. Return Book");
	System.out.println("5. Exist");
		
		
		Scanner S=new Scanner(System.in);
		//String Userinput=S.next();
		LibraryService li=new LibraryService();
	

     int Userinput2=S.nextInt();
     
     switch(Userinput2) {
     case 1:
    	 System.out.println("Enter the following informations ");
    System.out.println("Enter title");
    String title =S.nextLine();
    S.nextLine();
    System.out.println("Enter Author");
    String Author =S.nextLine();
   // S.nextLine();
    System.out.println("Enter Total copies");
    int availablecopies=S.nextInt();
    S.nextLine();
    System.out.println("Enter avaible  copies");
    int totalavailablecopies=S.nextInt();
    S.nextLine();
    System.out.println("Enter ID ");
    int id=S.nextInt();
    
    S.nextLine();
     
    Book book=new Book( Author, title,availablecopies, totalavailablecopies, id);
   li.addBook(book);
   break;
     case 2:
    	
  li. viewBooks();
  
     
     case 3:
    	 System.out.println("Enter the title of the book you want to borrow ");
    	 String Userspref=S.nextLine();
    	 li.borrowBook(Userspref);
    	 S.nextLine();
    	 break;
    	 
     case 4:
    	 System.out.println("Enter the Book you want to return");
    	 String Userspref1=S.nextLine();
    	 li.borrowBook(Userspref1);
    	 S.nextLine();
    	 break;
     
     case 5:
    	 System.out.println("EExisting.... ");
    	 break;
     default: System.out.println("Invalid input ");
    	 
     
     
     
     
     }}
     while(true);
     
     
     
     
	}
	



	}
