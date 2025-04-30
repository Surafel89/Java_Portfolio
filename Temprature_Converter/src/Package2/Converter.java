package Package2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Converter extends Userinput {
	
	
	public static void calcu() {
	
	ArrayList<String>listofcal=new ArrayList<String>();
	
	listofcal.add("Celsius ");
	listofcal.add("Fahrenheit");
	listofcal.add("kelvine ");	
	 double result=0;
	String unit="";
	
	switch(Userinput) {
	
	
	case 1:  result=(Userinput2 *9/5)+32;
	unit=listofcal.get(1);
		break;
	case 2: result=Userinput2+273.15;
	unit=listofcal.get(2);
	break;
	case 3: result=(Userinput2-32) *5/9;
	unit=listofcal.get(0);
	break;
	case 4: result=(Userinput2- 2)*5/9+273.15;
	unit=listofcal.get(2);
	break;
	case 5: result=Userinput2-273.15;
	unit=listofcal.get(0);
	break;
	case 6: result=(Userinput2-273.15)*5/9;
	unit=listofcal.get(1);
	break;
	}
	
	DecimalFormat df= new DecimalFormat("#.##");
	
	 System.out.println( df.format(result) +" "+unit);

	}

}
