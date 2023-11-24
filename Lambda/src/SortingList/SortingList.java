package SortingList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortingList {
	protected static List<String> strings = new LinkedList<>();
	private final static Scanner scanner = new Scanner(System.in);
	private static String string;
	
	public static void writeStrings() {
		while(true) {
		System.out.println("Write something: ");
		string = scanner.nextLine();
		if(string.equalsIgnoreCase("stop")) {
			break;
		}
		strings.add(string);
		System.out.println("If you want stop, just write \"stop\"");
		}
	}
	public static void sortList() {
		strings.sort((a, b) -> a.length() - b.length());
	}

	public static void readStrings() {
		strings.forEach(System.out::println);
	}
	public static void writeSomeDashes() {
		System.out.println("-------------------------------------------");
	}
	
	public static void main(String[] args) {
		writeStrings();
		writeSomeDashes();
		readStrings();
		sortList();
		writeSomeDashes();
		readStrings();
	}
}
