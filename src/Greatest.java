import java.util.Scanner;

//Write a program to find greatest of three numbers using nested if-else.
public class Greatest {

	public static void main(String[] args) {
		System.out.println("enter the three numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("a= "+a+" is maximum number");
		else if(b>c && b>a)
			System.out.println("b= "+b+" is maximum number");
		else
			System.out.println("c= "+c+ " is maximum number");
	}

}
