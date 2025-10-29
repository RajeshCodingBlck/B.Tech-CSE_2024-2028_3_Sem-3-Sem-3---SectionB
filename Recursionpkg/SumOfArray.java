package Recursionpkg;

public class SumOfArray {

	
	public static int getSum(int [] arr, int i) {
		
		if(i==arr.length) {
			return 0;
		}
		
		int SmallerAns= getSum(arr, i+1);
		int BiggerProblemAns= arr[i]+ SmallerAns;
		return BiggerProblemAns;
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int [] arr= {1,2,3};
		System.out.println(getSum(arr, 0));
		
	}

}
