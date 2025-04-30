package package2;

import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissor {

	//static Scanner s;
	static String complays;
	static String []choice={"R","P","S"};
	static int moves;
	static boolean isvalid;
	static String usersin;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	humanPlay();
	compplay();
	validation();
	
	}

	private static void humanPlay() {
		
System.out.println("Chose R:Rock, P for Paper, S for Scissors");
		 Scanner s=new Scanner(System.in);
		 usersin=s.nextLine();
	
		for (int i = 0;i<=choice.length-1;i++) {
			
			if (usersin.equals(choice[i])) {
				System.out.println("You chose "+ usersin);
				isvalid=true;
				
				break;
			}
			else {
				isvalid=false;}

		}while(true) {
		if (isvalid==true) {
		
			return;
		}

		while  (!isvalid) {
			System.out.println("invalid input! Chose R:Rock, P for Paper, S for Scissors");
			usersin=s.nextLine();
			
			if (usersin.equals("S")||usersin.equals("R")||usersin.equals("P")) {
				
				isvalid=true;}}}
	
         }

	public static void compplay() {
		
		Random complays=new  Random();
		
		 moves=complays.nextInt(choice.length);
		System.out.println("Computer choose "+choice[moves]);	
	}

	public static void validation() {
		if (usersin.equals("R")&&  choice[moves].equals("S")||usersin.equals("S")&&  choice[moves].equals("P")||usersin.equals("P")&&  choice[moves].equals("R")) {
			
			System.out.println("Congargulations!! You Won The Game");
			
		}
		else if (choice[moves].equals("R")&&  usersin.equals("S")||choice[moves].equals("S")&&  usersin.equals("P")||choice[moves].equals("P")&&  usersin.equals("R")) {
			
			System.out.println(" Computer  Won The Game");
			
		}
		else if (choice[moves].equals("R")&&  usersin.equals("R")||choice[moves].equals("P")&&  usersin.equals("P")||choice[moves].equals("S")&&  usersin.equals("S")) {
			
			System.out.println(" The Game ends in a Draw ");
			
		}
	}
	
	
	
}
