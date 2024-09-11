package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Start amount: ");
		int startAmount = in.nextInt();
		
		System.out.print("Win chance: ");
		double winChance = in.nextDouble();
		
		System.out.print("Win limit: ");
		int winLimit = in.nextInt();
		
		System.out.print("Total simulations: ");
		int totalSimulations = in.nextInt();
		
		for (int x = 1; x < totalSimulations; x++) {
			int amount = startAmount;
			System.out.println("Day: " + x);
			int games = 0;
			
			while (startAmount < winLimit && startAmount > 0) {
				games++;
				double game = Math.random();
				if (game < winChance) {
					amount++;
				}
				else {
					amount--;
				}
			}
			
			System.out.println("Games: " + games);
			if (amount != 0) {
				System.out.println("Success");
			}
			else {
				System.out.println("Ruin");
			}
		}
		
		System.out.println(startAmount);
		
	}

}
