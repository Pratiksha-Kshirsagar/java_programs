package pratiniha;
import java.util.Scanner;

public class EvenOdd {
	int a;
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
System.out.println("enter no to check Even or Odd");
 int a= sc.nextInt();
 if (a % 2 == 0)
 {
	 System.out.println(" no is Even."); 
	 
 }
 else 
 {
	 System.out.println(" no is Odd."); 
	}

}
}
