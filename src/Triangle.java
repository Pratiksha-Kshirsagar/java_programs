package pratiniha;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		 	int a, b, c, sum =0;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter 3  angles of a triangle ");
			 a= sc.nextInt();
			 b = sc.nextInt();
			 c= sc.nextInt();
			 sum= a + b +c;
			 if((sum == 180) && (a> 0) && (b>0) && (c>0)) 
			 {
				 System.out.println(" it is a valid triangle ");
			 }
				 
			 else 
			 {
				 System.out.println(" invalid triangle "); 
			 }
			 
			 
	}

}
