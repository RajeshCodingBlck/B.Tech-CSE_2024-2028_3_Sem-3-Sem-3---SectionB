package Recursionpkg;

public class PrintInIncreasingOrder {

	
	public static void PrintIncOrder(int n) {
		
		if(n==0) {
			return;
		}
		
		
		System.out.println(n);
		PrintIncOrder(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintIncOrder(5);
		
	}

}
