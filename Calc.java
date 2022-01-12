
public interface Calc {
	
	
	static void sum(int a,int b) {
		System.out.println("sum of two numbers is " +(a+b));
	}
	static void sub(int a,int b) {
		System.out.println("subtraction of two numbers" +(a-b));
		
	}
	static void mul(int a,int b) {
		System.out.println("multiplication of two numbers" +(a*b));
		
	}
	static void div(int a,int b) {
		System.out.println("division of two numbers" +(a/b));
	}
} 
