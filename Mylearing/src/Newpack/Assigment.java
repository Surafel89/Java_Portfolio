package Newpack;


public class Assigment {

int no_Con;
String name_con;
char lett;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Assigment Su=new Assigment(1);
		
	}
	

  public Assigment() {
	  this(3, "three", '!');
	  
	  System.out.println("this is Defult constractor");
	  
	  	  
	  
  }

  public Assigment(int no_Con ) {
	  
	  this(2, "two");
	  System.out.println("this is " +no_Con + " parameterized constractor");
	  
  }
  public Assigment (int no_Con , String name_con ) {
	  
	  this();
	  System.out.println("this is " +no_Con +" ("+ name_con +") "+ " parameterized constractor");
	  
  }
  
  
  public Assigment (int no_Con, String name_con, char lett) {
	  
	  System.out.println("this is " +no_Con +"("+ name_con +")"+ " parameterized constractor "+ lett);
	  
	  
	  
  }





}

