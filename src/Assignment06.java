/*pleas disregard my previous example i thought that the i have to make program from each in the list*/
import java.util.*;
public class Assignment06 {

	public static void main(String[] args){
		// Variables
		int age;
		String item;
		double balance =0.0;
		//boolean
		boolean status = true;
		double total = 0.0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Lets see what kind of drinks can you buy!");
		
		System.out.println("Please enter your age: ");
		age = in.nextInt();
		
		
		//if- else usage
		if( age > 18){
			
			while(status){
			System.out.println("Please Select your drink : "
					+ "\na)milk \nb)soda \nc)beer \nd)liquor");
			
				item = in.next();
				switch(item){
				case "a": System.out.println("You selected Milk: 1.25");
							balance = 1.25;
							break;
				case "b": System.out.println("You selected Soda: 1.00");
							 balance = 1.00;
							break;
				
				case "c": System.out.println("You selected Beer: 6.10");
							 balance = 6.10;
							break;
				
				case "d": System.out.println("You selected Liquor: 11.50");
							 balance = 11.50;
							break;
				}
				System.out.println("Do you want to continue \"true/false\" to exit")  ;
				status = in.nextBoolean();
				total += balance;
			}
		}else{
			while(status){
			System.out.println("Please Select your drink : "
					+ "\na)milk \nb)soda");
			item = in.next();
			
			switch(item){
			case "a" : System.out.println("You selected Milk: 1.25");
						balance = 1.25;
						break;
			
			case "b" : System.out.println("You selected Milk: 1.00");
						balance = 1.00;
						break;
			}
			System.out.println("Do you want to continue \"true/false\" to exit")  ;
			status = in.nextBoolean();
			total += balance;
		}
		}
		
		System.out.println("your total is : "+ total);
		}
}
