package ArrayDemo;

import java.util.Scanner;

public class ArrayBasicProblems {

	public static int getMinimum(int[] arr) {

		int AabhiTaakKaMinimum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (AabhiTaakKaMinimum > arr[i]) {
				AabhiTaakKaMinimum = arr[i];
			}
		}
		return AabhiTaakKaMinimum;
	}

	public static int getMaximum(int[] arr) {

		int AabhiTaakKaMaximum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (AabhiTaakKaMaximum < arr[i]) {
				AabhiTaakKaMaximum = arr[i];
			}
		}
		return AabhiTaakKaMaximum;
	}
	
	
	public static boolean isPresent(int [] arr,
			int target) {
		
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]==target) {
				return true;
			}
		}
		
		return false;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int ans = getMinimum(arr);
		System.out.println(ans);

	}

}
