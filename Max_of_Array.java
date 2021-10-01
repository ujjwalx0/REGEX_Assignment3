package Assignments_Regex;

public class Max_of_Array {

	public static void main(String[] args) {
		int maxx;
		int arr [] = new int [] {3,34,45,12,9,63};
		maxx = arr[0];
		
		for (int i=0;i <arr.length;i++) {
			if ( arr[i]>maxx )
			
			maxx=arr[i];
		
			
		}
		System.out.println("max in array:"+ maxx);
		

	}

}
