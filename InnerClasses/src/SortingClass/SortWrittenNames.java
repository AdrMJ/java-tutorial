package SortingClass;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortWrittenNames {
	protected final static Scanner scanner = new Scanner(System.in);  
	private static List<String> listOfNames = new LinkedList<>();
	private static String name;
	
	public static void writeNames() {
		while(true) {
			System.out.println("Write name: ");
			name = scanner.nextLine();
			if(name.equalsIgnoreCase("stop")) {
				break;
			}
			listOfNames.add(name);
			System.out.println("If you want stop, write \"stop\".");
			
		}
	}
	
	
	public static void sortNames() {
		
		Collections.sort(listOfNames, new Comparator<String>() {
			@Override
			public int compare(String word1, String word2) {
				return word1.length() - word2.length();
			}
		});
	}
	
	public static void readNames() {
		for(String name : listOfNames) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		
		writeNames();
		System.out.println("--------------------Before Sorting------------------");
		readNames();        
		System.out.println("--------------------After Sorting-------------------");
		sortNames();
		readNames();
		
	}
}
