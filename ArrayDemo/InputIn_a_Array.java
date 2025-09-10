package ArrayDemo;

import java.util.Scanner;

public class InputIn_a_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt(); // Array ka Size
		
		// n size ka array create karna
		int [] arr= new int[n];
		
		// Input 
		for( int i=0 ;i<arr.length;i++) {
			arr[i]= s.nextInt();
		}
		
		
		// Task
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println(sum);
		
		
//		for( int i=0 ;i<arr.length;i++) {
//			//arr[i]= s.nextInt();
//			System.out.print(arr[i]+" ");
//		}
		
		
		
		
		
		
	}

}
