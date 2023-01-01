import java.util.Scanner;  
public class Avg 
{  
public static void main(String args[])  
{  
float m1,m2,m3,m4,m5,total,percentage;
 
  
Scanner sc=new Scanner (System.in);  
System.out.print("Enter the marks of 5 subjects: ");  
float m1 =in.nextfloat();  
float m2 =in.nextfloat();
float m3 =in.nextfloat();
float m4 =in.nextfloat();
float m5 =in.nextfloat();
System.out.println("marks "+ m1 +m2 + m3 + m4);  
total=m1 + m2 + m3 + m4 + m5;
System.out.println("toal marks:" + total);
percentage = (float)((total / 500.0) * 100);
System.out.println("toal marks:" + percentage);
}
}
