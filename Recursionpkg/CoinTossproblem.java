package Recursionpkg;

public class CoinTossproblem {

	
	public static void getCombination(int n, String ans) {
		
		
		 if(n==0) {
			 
			 System.out.println(ans);
			 return;
		 }
		
		
		getCombination(n-1, ans+"H");
		getCombination(n-1, ans+"T");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 getCombination(3, "");
	}

}
