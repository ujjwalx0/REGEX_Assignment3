package Assignments_Regex;

public class Sort_Array {

	public static void main(String[] args) {
		int temp=0;
		int arr[]= {66,43,11,-5,76,9};
		 System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }   
		
		for (int i=0;i<arr.length;i++) {
			
			for (int j =i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
					
					
				}
			}
		}
		 System.out.println("\n"+ "mElements of array sorted in ascending order: " ); 
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
            
	}

}
