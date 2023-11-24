import landAnimals.*;
import seaAnimals.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Dolphin dolphin = new Dolphin();
		Salomon salomon = new Salomon();
		
		System.out.println("Cat:");
		System.out.println("Speed " + cat.getSpeed());
		System.out.println("Weight " + cat.getWeight());
		System.out.println("Height " + cat.getHeight());

		System.out.println("Dog:");
		System.out.println("Speed " + dog.getSpeed());
		System.out.println("Weight " + dog.getWeight());
		System.out.println("Height " + dog.getHeight());
		
		System.out.println("Dolphin:");
		System.out.println("Speed " + dolphin.getSpeed());
		System.out.println("Weight " + dolphin.getWeight());
		System.out.println("Height " + dolphin.getHeight());
		
		System.out.println("Salomon:");
		System.out.println("Speed " + salomon.getSpeed());
		System.out.println("Weight " + salomon.getWeight());
		System.out.println("Height " + salomon.getHeight());
		*/
		StringBuilder finalStringBuilder = new StringBuilder();
		for (int counter = 0; counter < 1000000; counter++) {
		    finalStringBuilder.append(" ");
		    finalStringBuilder.append(counter);
		}
		String finalString = finalStringBuilder.toString();
		System.out.print(finalString);
	}
}
