package Exercise2;

import java.util.Scanner;
public class Main {
	//Write a program collecting from user two integral number. Display result of division with fraction part 
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Write your dividend:");
		int x = scanner.nextInt();
		System.out.print("Write your divisor:");
		int z = scanner.nextInt();
		double result = (double)x / z;
		
		scanner.close();
		
		System.out.println("Your quotient is " + result);
	}

}
