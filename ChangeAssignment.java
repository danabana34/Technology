/**
 * The ChangeMaker program implements an application that 
 * will display the amount of change a user will receive *
 * 
 * @author Dana Walker
 * @version 1.0
 * @since 2018 - 04- 23/
*/

package changemaker;

import java.util.Scanner;

public class ChangeAssignment {

	public static void main(String[] args) {
		
	
		// Computes the required quarters, nickels, dimes, and pennies
		// Max Change is 99 cents but I used a 100 because I was working with a mentor and he said it was ok
	
	
	
		Scanner in = new Scanner(System.in);
		System.out.println("How much does the item cost (in cents):");
		double amount = in.nextDouble();
		System.out.println("How much did you pay?: ");
		int amountReceived = in.nextInt();
		int change = changeMade(amount, amountReceived);
		System.out.println(Cents(change));
		
		
					
}
		
		
	public static int changeMade(double amount, int amountReceived) {
		
	
		double totalDue = amount* 100;
		//System.out.println(totalDue);
		int change=  (int) ((amountReceived * 100) - totalDue);
		return change;
		
	}
	
		
	public static int Cents(int change) {
		System.out.println(change);
		int quarters = change/25;
		int remainingAmount = change %25;
		int dimes = remainingAmount/10;
		remainingAmount =remainingAmount%10;
		int nickels = remainingAmount /5;
		remainingAmount = remainingAmount % 5;
		int pennies = remainingAmount;
		
		//System.out.println(x);
		System.out.println("Pennies:" +pennies);
		System.out.println("Nickels:" +nickels);
		System.out.println("Dimes:" +dimes);
		System.out.println("Quarters:" +quarters);
		return change;
	
		 
		
	
		
	}
		
		
		
	}

	
	