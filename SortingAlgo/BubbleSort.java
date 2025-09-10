package SortingAlgo;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {

		int n = arr.length;
		for (int round = 1; round < n; round++) {
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,3,6,2,5,4,10 };

		bubbleSort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
