package Recursionpkg;

public class factorialUsingRecursion {
  
	
	public static int factorial(int n) {
		
		
		if(n==0) {
			return 1;
		}
		
		
		int chhotaAns= factorial(n-1);
		int Myans= n*chhotaAns;
		return Myans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(5));
		
	}

}
