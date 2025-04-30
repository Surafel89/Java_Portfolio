package Package2;

import java.util.Scanner;

public class Userinput {
	static Scanner s=new Scanner(System.in);
	 static double Userinput2;
	static int  Userinput;
	
	public static void Usersin() {
		boolean isvalid1=true;
		boolean isvalid2=true;
	do {isvalid1=true;
	
	
	try {
		Userinput=s.nextInt();
		if(Userinput>=1&&Userinput<=6) {
			isvalid1=true;
			
		}
		else {
			System.out.println("Invalid input please try again ");
			isvalid1=false;
		}
		
	}catch(Exception e){
		System.out.println("Invalid input please try again ");
       String stringin=s.nextLine();
        isvalid1=false;

	}}
	while (isvalid1==false);
	
do {isvalid2=true;
System.out.println("Enter the value you want to convert ");
	
	try {
	 Userinput2=s.nextDouble();
		
		
		}
		
	catch(Exception e){
		System.out.println("Invalid input please try again ???");
       String stringin=s.nextLine();
        isvalid2=false;

	}}
	while (isvalid2==false);


}
	



}
