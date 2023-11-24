package Exercise1;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	// Write a program which will take from user integral number and will return result of multiplication of this number and number PI. Display this number like integer and floating-point arithmetic 
	public static void main(String[] args) {
		System.out.print("Write your number: ");
		int x = scanner.nextInt();
		int resultInt = (int) (x * Math.PI);
		double resultDouble = x * Math.PI;
		scanner.close();
		
		System.out.println("Result of multiplication of your number and PI is " + resultInt + " and " + resultDouble);
		
	}

}
