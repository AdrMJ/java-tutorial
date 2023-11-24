package Exercise2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Scanner;

public class Human implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name = "";
	private transient int age = 0;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static Human createANewHuman() {
		System.out.println("Write your name: ");
		String name = scanner.nextLine();
		System.out.print("Write in which year you were born: ");
		int year = scanner.nextInt();
		Human human = new Human(name, year);
		return human;
	}
	public static void createDataBase(String filePath, Human human) throws FileNotFoundException, IOException {
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filePath))){
			output.writeObject(human);
		}
	}
	public static void readDataBase(String filePath) throws FileNotFoundException, IOException, ClassNotFoundException  {
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(filePath))){
			Human readObject = (Human) input.readObject();
			System.out.println(readObject.name);
			System.out.println(readObject.age);
		}
	}
	
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        age = stream.readInt();
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(Calendar.getInstance().get(Calendar.YEAR) - age);
    }
	
	
	protected static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String filePath = "C:\\Users\\Jan Kochanowski\\eclipse-workspace\\OperationsOnFiles\\src\\Exercise2\\People.txt";
		
		createDataBase(filePath, createANewHuman());
		readDataBase(filePath);
	}

}
