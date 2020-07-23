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
			add(a,b);
		}else if(c=='-') {
			sub(a,b);
		}else if(c=='/') {
			div(a,b)
		}else {
			mult(a,b)
		}
			
	
	}
	
	
	
	
	

}
