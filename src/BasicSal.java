package pratiniha;
import java.util.Scanner;
public class BasicSal {
		
	public static void main(String[] args) {
		 float tax1=1, tax2=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter basic salary");
		 float sal= sc.nextFloat();
		 if(sal < 150000)
		 {
			 System.out.println("no tax"); 
		 }
		 else if ( (sal > 150000) &&( sal < 300000))
		 
		 { 
			 tax1= (sal *20) / 100;
		 System.out.println("20 % tax =" + tax1); 
		 }
		 else if (sal > 300000)
		 {
		 tax2 = (sal *20) / 100;
		 System.out.println("20 % tax =" + tax2); 
		 }
		 else 
		 {
			 System.out.println("invalid salary");  
		 }
}
}
