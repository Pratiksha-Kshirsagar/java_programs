import java.util.Scanner;  
public class AreaofCircle 
{  
public static void main(String args[])  
{  
double circumference, area;   
int radius;  
  
Scanner sc=new Scanner (System.in);  
System.out.print("Enter the radius of the circle: ");  
radius=sc.nextInt();  
 
area=Math.PI*(radius*radius);  

System.out.println("The area of the circle is: "+area);  
 
circumference=Math.PI*2*radius;  

System.out.println("The circumference of the circle is: "+circumference);  
}  
} 