import java.util.*;
public class newCalc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter tour first number");
		double a=s.nextDouble();
		System.out.print("Please enter tour second number");
		double b=s.nextDouble();
		System.out.print("Please enter the operation");
		char c=s.next().charAt(0);
		if(c=='+') {
			System.out.println(add(a,b));
		}else if(c=='-') {
			System.out.println(sub(a,b));
		}else if(c=='/') {
			System.out.println(div(a,b));
		}else {
			System.outprinln(mult(a,b);
		}
			
	
	}
	public static double add(double a, double b) {
		return a+b; 
	}
	public static double sub(double a, double b) {
		return a+b; 
	}
	public static double div(double a, double b) {
		return a/b; 
	}
	public static double mult(double a, double b) {
		return a*b; 
	}
	
	
	
	
	

}
