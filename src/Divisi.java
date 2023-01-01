package pratiniha;

import java.util.Scanner;

public class Divisi {
	int a;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no to check Divisibility by 5 and 7");
		 int a= sc.nextInt();
		 if ((a % 5 == 0) && (a % 7 == 0))
		 {
			 System.out.println(" no is Divisible by 5 and 7"); 
		 }
		 else 
		 {
			 System.out.println(" no is not Divisible by 5 and 7");  
		 }
	}

}
