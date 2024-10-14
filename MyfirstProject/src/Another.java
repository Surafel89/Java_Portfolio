

import java.util.Scanner;



public class Another {
	
	public static void main(String[]arrg) {
		
		//(atb)(b+c)
		
	Scanner inputvalue=new Scanner(System.in);	
	
	Another Objmethoud=new Another();
	//Another sum=new Another();
	//Another sum2=new Another();
	
/*	int sumvalue1=Objmethoud.sumcal(10,2);
	int sumvalue2=Objmethoud.sumcal2(sumvalue1,2);
	int sumvalue3=Objmethoud.sumcal(sumvalue2,2);
	int multivalue=Objmethoud.prod(sumvalue2,2);
	Objmethoud.quo( multivalue,2);*/
	
	int multival=Objmethoud.prod(10,2);
	int subval=Objmethoud.sumcal2(multival, 2);
	int suval2=Objmethoud.sumcal2(subval, 2);
	int addval=Objmethoud.sumcal(suval2,2);
	int dvival=Objmethoud.quo(addval, 2);
	
	
			
System.out.println (Objmethoud.quo(addval, 2));	
	
		
	
	
	
	
	
	}
	
	
	int  sumcal(int a,int b) {
		int sum;
		
		
		sum=(a+b);
		System.out.println("sum is "+ sum);
	
		return sum;
		
		
   
		}
	int sumcal2(int c, int d ) {
		
	  
		
		int sub;
		sub=(c-d);
	
		System.out.println("diff is "+ sub);
	return sub;	
	
		
	}
	
int prod (int r1, int r2) {
		
		
		int product=r1*r2;
		System.out.println("prod is "+ product );
		
		return product;
		
		
		
	}

int quo (int q1 ,int q2)
{
	int quotient=q1/q2;
	System.out.println("quo is "+ quotient);
	
	return quotient;

}
	

}
