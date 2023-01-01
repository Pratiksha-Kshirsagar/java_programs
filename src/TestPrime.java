import java.util.Scanner;
public class TestPrime {

	public static void main(String[] args) {
			
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<no/2;i++)
		{
			if(no%2==0)
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
				break;
			}
		}
		
		if(flag==true)
			System.out.println("Number is not prime ");
		else 
			System.out.println("Number is prime ");
	}

}
