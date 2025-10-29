package Recursionpkg;

public class PrintThaArray {

	public static void printTheArray(int [] arr, int i) {
		
		if(i==arr.length) {
			return ;
		}
		System.out.print(arr[i]+" ");
		printTheArray(arr, i+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5};
      printTheArray(arr, 0);
	}

}
