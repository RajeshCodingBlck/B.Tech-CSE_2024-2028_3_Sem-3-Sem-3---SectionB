package TwoDArraypkg;

import java.util.Scanner;

public class InputIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [][] arr= new int[4][4];
		
		Scanner s= new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			for(int j=0; j<4;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		System.out.println(arr); // address of 2D Array
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
