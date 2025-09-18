package TwoDArraypkg;

public class ColWiseZigZagOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {
				   
				   {1,2,3,4,5},
				   {6,7,8,9,10},
				   {11,12,13,14,15},
				   {16,17,18,19,20}
		   };
		
		for(int j=0; j<5;j++) {
			
			if(j%2==0) { // UP to Down
				
				for(int i=0;i<4;i++) {
					System.out.print(arr[i][j]+" ");
				}
			}else { // Down To Up
				
				for(int i=3;i>=0;i--) {
					System.out.print(arr[i][j]+" ");
				}
				
			}
		}
		
		
	}

}
