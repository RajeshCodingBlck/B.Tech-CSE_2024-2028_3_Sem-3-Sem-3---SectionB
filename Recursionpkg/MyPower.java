package Recursionpkg;

public class MyPower {

	
	public static int pow(int a, int b) {
		
		 if(b==0) {
			 return 1;
		 }
		
		  int smallerAns= pow(a, b-1);
		  int myAns= a*smallerAns;
		  return myAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println(pow(10,5));
	}

}
