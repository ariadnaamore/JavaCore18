package homework2;

import java.util.Scanner;

public class Methods {
	public	int a;
	public int b;
	public static int result;
	
	
	
	public Methods() {
		
	}


	
	//Operator for catch the Exceptions
	public static void operatorMath (int a, int b) {
		try {
			checkAgruments(a, b);
		} catch (IllegalArgumentException e) {	
			e.printStackTrace();
		System.out.println("You entered a<0 or b<0!!!");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("You entered a=0 and b!=0 or a!=0 and b=0!!!");
		}catch  (IllegalAccessException ia) {
			ia.printStackTrace();
			System.out.println("You entered a=0 and b=0!!!");
		}catch (MyException me) {
			me.printStackTrace();
			System.out.println("You entered a>0 and b>0!!");
		}						
	System.out.println("result is  = "+ result);
	}	
	
	
	//Method Plus
	public static void plusMeth(int a, int b) {		
	result = a+b;
		System.out.println("a-b = "+ result);
	}

	
	// Method minus
	public static void minusMeth(int a, int b) {
		
	result = a-b;
		System.out.println("a-b = "+ result);
	}

	// Method Multiple
	public static void multipleMeth(int a, int b) {
		
	result = a*b;
	System.out.println("a*b = "+ result);
	}

	// Method Divide
public static void divideMeth(int a, int b) {
	
	result = a/b;
	System.out.println("a/b = "+result);
	
}


//Check arguments according to condition and throw exceptions
	public static void checkAgruments (int a, int b) throws RuntimeException, IllegalAccessException{
		if ((a < 0) && (b < 0)) {
	        throw new IllegalArgumentException("Bad value! ");
	    }else if ((a==0 && b!=0)||(a!=0 && b==0) ) {
	        throw new ArithmeticException("Bad value!");
	    } else if  (a==0 && b==0) {
			throw new IllegalAccessException("Bad value!");
		}else if  (a>0 && b>0) {
			throw new MyException("Bad value!");
		}else {
			plusMeth(a,b);
			System.out.println("a+b= " + result);
			minusMeth(a,b);
			multipleMeth(a,b);
			divideMeth(a,b);
			
		}
	    	System.out.println("Operation end");
	    }
	 
	
	




	
}
