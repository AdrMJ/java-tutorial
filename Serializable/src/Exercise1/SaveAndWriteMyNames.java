package Exercise1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SaveAndWriteMyNames {

	protected static Scanner scanner = new Scanner(System.in);
	
	public static boolean askAboutNames() {
		System.out.println("Can you write some names? y/n");
		
		String answer = "";
		
		while(true) {
			answer = scanner.nextLine();
			if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
				if(answer.equalsIgnoreCase("y")) {
					return true;
				} else {
					return false;
				}
			}
			System.out.println("You can write only y or n");
		}
	}
	public static List<String> createList() {
		String name, answer = "";
		List<String> names = new LinkedList<>();
		
		while(true) {
			System.out.println("Write a name");
			name = scanner.nextLine();
			names.add(name);
			System.out.println("Are you sure, you want more names in list? y/n");
			answer = scanner.nextLine();
			if(answer.equalsIgnoreCase("n")) {
				return names;
			} else if(answer.equals("y")) {
				
			} else {
				scanner.close();
				throw new IllegalArgumentException("You didn't answer!");
			}
		}
	}
	public static void createDataBase(String filePath, List<String> list) throws IOException {
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filePath))){
			output.writeObject(list);
		}
	}
	@SuppressWarnings("unchecked")
	public static void readDataBase(String filePath) throws IOException, ClassNotFoundException {
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(filePath))){
			List<String> list = new LinkedList<>();
			list = (List<String>) input.readObject();
			System.out.println("Saved names: ");
			for(String name : list) {
				System.out.println(name);
			}
		}
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String filePath = "C:\\Users\\Jan Kochanowski\\eclipse-workspace\\Serializable\\src\\Exercise1\\MyDataBase.txt";
		if(askAboutNames()) {
			createDataBase(filePath, createList());
			readDataBase(filePath);
		}
	}
}
