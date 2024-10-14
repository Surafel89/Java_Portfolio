
//mini calculator 
import java.util.Arrays;
import java.util.Scanner;
import java.awt.event.KeyEvent;


public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Number= new Scanner(System.in);
	//Scanner Numner2= new Scanner(System.in);
	//Scanner Result12=new Scanner(System.in);
	
	System.out.println("Hello welcome please enter a number  " );
	double num1=Number.nextInt();
	
	System.out.println("please enter another number  " );

	double num2=Number.nextInt();
	String [] Opertion =new String[]{"1.SUM"  , "2.Diff" ,"3.Prod" ,  "4.qutio"};
	for (int i=0;i<4;i++) {
		
		
		System.out.println(Opertion[i]);
		
	}
	
	System.out.println("Chose which one of the opertion you want to exctute above ");
//	int[] Opertion2 = Arrays.stream(Opertion).mapToInt(Integer::parseInt).toArray();
	
	//int [] Opertion2;

	// Opertion2= new int[]{1 ,2,3,4};
	//int opertation1 = 1;
	//int operation2=2;
	//int operation3=3;
	//int opertion4=4;
	double sums=num1+num2;
	double difference=num1-num2;
	double product=num1*num2;
	double quotient=num1/num2;
	
	
	//System .out.println(Opertion);*/
	Scanner Userselection= new Scanner(System.in);
	
	
	double selection1 =Userselection.nextInt();
	
	
	/*selection1=2;
	selection1=3;
	selection1=4;*/
	
	//for (int  i =0; i<5;i ++  ) {
	
	if(selection1 == 1 ) {
	
	System.out.println("the sum of the numers is  " + (sums));}
	else if(selection1 == 2) {
		System.out.println("the difference of the numers is  " + (difference));
	}
	else if (selection1 == 3) {
		System.out.println("the product of the numers is  " + (product));
	}
	else if (selection1 == 4) {
		System.out.println("the quotient of the numers is  " + (quotient));
	}
	else {System.out.println("Incorrect entery ");}
	
for (int i=0;i<2;i++) {
		
		
		System.out.println("    ");
		
	}
	
	
	
	//}
	
	
	
for (int i=0;i<4;i++) {
		
		
		System.out.println(Opertion[i]);
		
	}
	
	System.out.println(" Chose which one of the opertion you want to exctute above ");
	
	//}
	
	
	
	}
	
	
	
	//System.out.println(  Number1.nextLine());
	//System.out.println("Enter the a number " + Numner2.nextLine());
	
	
	//++;
	

}
	

	

