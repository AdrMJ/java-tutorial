package Interface;
import java.util.Scanner;


public class Main {
	
	private static Scanner scanner = new Scanner(System.in);	
	
    public static void main(String[] args) {
        
    	Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); 
        }
        else {
            computation = new Addition(); 
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();
        scanner.close();
        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Write M if you want to multiply. You sum up in a different way.");
        
    		return scanner.nextLine().equals("M");
    }
    

    private double getArgument() {
    	System.out.println("Write argument");
    	
        return scanner.nextDouble(); 
    }
}