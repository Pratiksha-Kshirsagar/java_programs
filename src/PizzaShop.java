//Create menu driven program for Pizza Shop.And display total amount
package TestSwitch;

import java.util.Scanner;

public class PizzaShop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int ch,index=0;
		int[] cost=new int[10];
		String[] pizza= new String[20];
		do {
			System.out.println("1.Select Pizza 2.Add to Cart 3.Buy 4.Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("1.Paneer Pizza 2.Veg Cheese Pizza 3.Onion Pizza");
					System.out.println("Enter your choice:");
					int c=sc.nextInt();
					switch(c) {
						case 1:
							System.out.println("Panner Pizza:Rs 200");
							pizza[index]="Panner Pizza";
							cost[index]=200;
							index++;
							break;
						case 2:
							System.out.println("Veg Cheese Pizza:Rs 250");
							pizza[index]="Veg Cheese Pizza";
							
							cost[index]=250;
							index++;
							break;
						case 3:
							System.out.println("Onion Pizza:Rs 150");
							pizza[index]="Onion Pizza";
							
							cost[index]=150;
							index++;
							break;
					}
					break;
					
				case 2:
					System.out.println("Your Cart:");
					for(int i=0;i<index;i++)
					{
						System.out.println(" "+pizza[i]);
						System.out.println(" "+cost[i]);
					}
					break;
					
					
					
			
			}
			
		}while(ch!=4);
		
		
		

	}

}
