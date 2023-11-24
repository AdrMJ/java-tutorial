package Couples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;

public class Couples {
public static final String NO_MORE_NAMES = "-";
	
	public static void main(String[] args) {
		
		 Map<String, String> pairs = new HashMap<>();
	        Scanner input = new Scanner(System.in);
	        String name1, name2;

	        while(true) {
	            System.out.println("Write name: ");
	            name1 = input.next();
	            if (name1.equals("-")) {
	                break;
	            }
	            System.out.println("Write name again: ");
	            name2 = input.next();
	            if (name2.equals("-")) {
	                break;
	            }
	            pairs.put(name1, name2);
	        }

	        System.out.println("Write name from couple: ");
	        name1 = input.next();
	        System.out.println("One person's name is " + name1 + " and second person's name is " + pairs.get(name1));
	    }
}

