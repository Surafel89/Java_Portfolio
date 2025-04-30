package Gpacalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class gpaCalculator {
	;

	public static void main(String[] args) {
		
		takeUserinput();
		
	}

	private static void takeUserinput() {
            boolean isvalidcreadit=false;
			
             String Grade;
			 int creaditin=0;
			 Scanner S=new Scanner(System.in);
			 String creadit;
			 int points=0;
			 int totoalpoints=0;
			 int toatlcreadits=0;
			double GPA;
			 boolean userprefernce;
			 DecimalFormat df=new DecimalFormat("0.00");
			 
	 
do{
		 userprefernce=true;
				 
	 do {isvalidcreadit=true;
		 System.out.println("Enter your Credit");
		 S=new Scanner(System.in);
		 creadit=S.nextLine();
	
	 try {
		 creaditin =Integer.parseInt(creadit);
		 isvalidcreadit=true;
		 
		 }
	 catch(NumberFormatException e) {
		 isvalidcreadit=false;
		 
	 }}while(!isvalidcreadit);
	 
	 
	 int getValue=0;
	 boolean isvalidGrade=true;

	 do{  isvalidGrade=true;
	System.out.println("Enter your Grade");
	 Grade=S.nextLine();

	if(Grade.equalsIgnoreCase("A")) {
		getValue=4;}
	else if(Grade.equalsIgnoreCase("B")) {
		getValue=3;
	}
	else if(Grade.equalsIgnoreCase("C")) {
		getValue=2;
	}
	else if(Grade.equalsIgnoreCase("D")) {
		getValue=1;
	}
	else if(Grade.equalsIgnoreCase("F")) {
		getValue=0;
	}
	else {
		System.out.println("Invalid value grade entered! try again");
		isvalidGrade=false;
	}points=getValue*creaditin;
	
	System.out.println("Creadits "+creadit);
	System.out.println("Points "+points);
	System.out.println("Grade "+Grade);

	 }

	while(!isvalidGrade);
	 
	 totoalpoints+=points;
	  toatlcreadits+=creaditin;
	  GPA=Double.valueOf(totoalpoints)/ Double.valueOf(toatlcreadits);
	  System.out.println("Do you want to contiue adding classes or get the final GPA, Enter Y for yes N for No");
	  String userchoice;
		userchoice=S.nextLine();
		if (userchoice.equalsIgnoreCase("Y")) {
			userprefernce=true;
		}
		else if(userchoice.equalsIgnoreCase("N")) {
			userprefernce=false;
		} }
			 
	  while(userprefernce==true);
			
	System.out.println("Creadits "+toatlcreadits);
	System.out.println("Points "+totoalpoints);
	System.out.println("GPA "+ df.format(GPA));
	
	 
 }}
