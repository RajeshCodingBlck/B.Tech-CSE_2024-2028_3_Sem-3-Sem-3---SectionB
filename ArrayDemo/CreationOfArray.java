package ArrayDemo;

public class CreationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a;
//		System.out.println(a);
		int arr[]=new int[5];
		
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
//		System.out.println(arr[0]);
		
		System.out.println(arr.length);
		for( int i=0; i<arr.length;i++ ) {
			arr[i]= 10*(i+1);
		}
		
		for(int i=0 ; i<=4;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
