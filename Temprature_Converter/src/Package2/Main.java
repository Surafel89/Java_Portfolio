package Package2;

public class Main {

	public static void main(String[] args) {
		display();
		Userinput U=new Userinput();
		Converter C=new Converter();
		U.Usersin();
		C.calcu();

	}
	public static void display() {
		
System.out.println(" Welcome please choose the conversion you want to do\n1.Celsius to Fahrenheit \n2.Celsius to Kelvine\n3.Fahrenheit to Celsius \n4.Fahrenheit to kelvine \n5.Kelvine to Celsius \n6.Kelvine to Fahreheit ");
		

	}

}
