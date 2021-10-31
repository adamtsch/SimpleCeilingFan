package ca.adam.ceilingfans;

import java.util.Scanner;

/**
 * Main Class to run text based interface
 * for the Ceiling Fan
 * 
 * @author adamtsch
 *
 */
public class RunSimpleCeilingFan {

	public static void main(String[] args) throws InterruptedException {

		CeilingFan fan = new CeilingFan();
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean continueInput = true;
		
		printInstructions();
		
		while (continueInput) {
			printDivider();
			printCurrentFanState(fan);
			printPrompt();

			// Get Input
			int in = -1;

			if (keyboard.hasNextInt()) {
				in = keyboard.nextInt();
			} else { // Handle Non Integer inputs by shaming user
				System.out.println("\nYou must enter a number (Integer)!");
				keyboard.next();
			}
			
			// Handle Input
			if (in == 1) { // Increase Speed
				
				System.out.println("\nCord One pulled...\n");
				fan.increaseSpeed();
				Thread.sleep(2000);
				
			} else if (in == 2) { // Reverse Directions
				
				System.out.println("\nCord Two pulled...\n");
				fan.reverseDirection();
				Thread.sleep(2000);
				
			} else if (in == 3) { // Display Current Fan Status
				
				System.out.println("\nDisplaying Status...\n");
				Thread.sleep(2000);
				printCurrentFanState(fan);
				
			} else if (in == 4) { // Print Instructions
				
				System.out.println("\nPrinting Instructions...\n");
				Thread.sleep(2000);
				printInstructions();
				
			} else if (in == 0) { // Exit Interface
				continueInput = false;
				System.out.println("\nExiting...\n");
				Thread.sleep(2000);
				
			} else { // Erroneous Input
				
				System.out.println("\nYour input is not valid! Please read instructions carefully!");
				Thread.sleep(2000);

			}
			
		}
		printDivider();
		printExitMessage();
		keyboard.close();
		System.exit(0);
		
	}

	// HELPER METHODS
	
	public static void printCurrentFanState(CeilingFan fan) {
		
		System.out.println("FAN STATUS: ");
		if (fan.getCurrentFanSpeed().equals(fan.getIsOffState())) {
			System.out.println("- Speed: Fan is Off");
			System.out.println("- Direction: No direction");
		} else {
			System.out.println("- Speed: " + fan.getCurrentFanSpeed().toString());
			System.out.println("- Direction: " + fan.getCurrentFanDirection().toString());
		}
	}

	public static void printInstructions() {
		System.out.println("INSTRUCTIONS:\n");
		System.out.println("Welcome to your new Ceiling Fan! "
				+ "The fan has 2 Cords.\n"
				+ "1. Cord One controls the fan speed\n"
				+ "2. Cord Two controls the fan direction while it is on");
		
	}
	
	public static void printPrompt() {
		
		System.out.println("\nEnter your input:");
		System.out.println("(1 for Cord One to increase speed)\n"
				+ "(2 for Cord Two to change directions)\n"
				+ "(3 to display current Fan Status)\n"
				+ "(4 to print instructions)\n"
				+ "(0 to exit the SimpleCeilingFan(tm) interface)\n");
		System.out.print("ENTER INPUT: ");
		
	}
	
	public static void printExitMessage() {
		System.out.println("Thank you for Staying Cool with your SimpleCeiling Fan.");
	}
	
	private static void printDivider() {
		System.out.println("\n ------------------------- \n");
		
	}
	
}
