package SquareRoot;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int x = 0;
		while(true) {
			System.out.println("Write the number: ");
			try {
				x = scanner.nextInt();
				break;
			} 
			catch (InputMismatchException e) {
				System.out.println("Write the correct number!");
				x = scanner.nextInt();
			}
		}
		scanner.close();
		if(x < 0) {
			throw new IllegalArgumentException(String.format("Square root of " + x + " doesn't exist!", x));
		}	
		
		System.out.println("Square root of " + x + " is " + Math.sqrt(x));
		

	}

}
