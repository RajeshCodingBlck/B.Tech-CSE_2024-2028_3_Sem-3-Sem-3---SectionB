package ArrayDemo;

import java.util.Scanner;

public class FreArray {

	public static void printFre(int [] arr) {
		
		int [] freArray= new int[101];
		
		for(int i=0; i<arr.length;i++) {
			
			int Index= arr[i]; 
			freArray[Index]++;
		}
		
		for(int i=1;i<=100;i++) {
			
		 if(freArray[i]>0) {
			System.out.println( i+ " "+ freArray[i]);
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		int [] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		printFre(arr);
	}

}
