package pratiniha;
import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in)	;
	System.out.println("Check an alaphabet isvowel or consonent");
	char ch=sc.next().charAt(0);

	
	if((ch =='a') && (ch=='e') && (ch=='i') && (ch=='o') && (ch=='u'))
	{
		System.out.println("Alphabet is vowel");
		
	}
	else
	{
		System.out.println("Alphabet is consonent");
	}
	}

}
