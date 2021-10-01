package Assignments_Regex;
import java.util.Scanner;

public class Student_Report_Application {

	
	    public static void main(String args[]) {
	       
	        Scanner in = new Scanner(System.in);
	         int TOTAL_STUDENTS ;
	        System.out.println("Enter the Number Of Students:");
	        TOTAL_STUDENTS =in.nextInt();
	        
	        
	        int rollNo[] = new int[TOTAL_STUDENTS];
	        String name[] = new String[TOTAL_STUDENTS];
	        int s1[] = new int[TOTAL_STUDENTS];
	        int s2[] = new int[TOTAL_STUDENTS];
	        int s3[] = new int[TOTAL_STUDENTS];
	        int s4[] = new int[TOTAL_STUDENTS];
	        int s5[] = new int[TOTAL_STUDENTS];
	        int s6[] = new int[TOTAL_STUDENTS];
	        double p[] = new double[TOTAL_STUDENTS];
	        String g[] = new String [TOTAL_STUDENTS];
	        
	        for (int i = 0; i < TOTAL_STUDENTS; i++) {
	            
	            System.out.println("Enter student " + (i+1) + " details:");
	            System.out.print("Roll No: ");
	            rollNo[i] = in.nextInt();
	            in.nextLine();
	            System.out.print("Name: ");
	            name[i] = in.nextLine();
	            System.out.print("Subject 1 Marks: ");
	            s1[i] = in.nextInt();
	            System.out.print("Subject 2 Marks: ");
	            s2[i] = in.nextInt();
	            System.out.print("Subject 3 Marks: ");
	            s3[i] = in.nextInt();
	            System.out.print("Subject 4 Marks: ");
	            s4[i] = in.nextInt();
	            System.out.print("Subject 5 Marks: ");
	            s5[i] = in.nextInt();
	            System.out.print("Subject 6 Marks: ");
	            s6[i] = in.nextInt();
	            
	            p[i] = (((s1[i] + s2[i] + s3[i] + s4[i] 
	                    + s5[i] + s6[i])/6 ));
	            
	                    
	            if (p[i] < 40)
	                g[i] = "fail";
	            
	            else
	                g[i] = "pass";
	        }
	        
	        System.out.println();
	        
	        for (int i = 0; i < TOTAL_STUDENTS; i++) {
	            System.out.println("Name :" +name[i] + "\n" +"Roll Number :"
	                +rollNo[i] + "\n" +"Total Marks : "+ (int) (p[i]*6) +
	                  " \n" + "Average of Marks:"+ p[i] + "\n" +"Result :"
	                + g[i]);
	        }
	    }
	}
			
			
		
			
		
		
		

