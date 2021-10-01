package Assignments_Regex;

public class Min_of_Array {

	public static void main(String[] args) {
		int min;
		int arr []= new int [] {34,-2,55,12,3,7};
		min = arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min= arr[i];
			}
		}
		
System.out.println("smallest element in the array is:"+ min);
	}

}
