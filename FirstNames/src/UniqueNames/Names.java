package UniqueNames;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Names{
	
	public static final String NO_MORE_NAMES = "-";
	
	public static void main(String[] args) {
		
		String name = "";
		Scanner scanner = new Scanner(System.in);
		Set<String> uniqueNames = new HashSet<>(); 
		
		while(!name.equals("-")){
			name = scanner.nextLine();
			if(!name.equals(NO_MORE_NAMES))
				addUniqueName(name,  uniqueNames);
		}
		scanner.close();
		uniqueNames(uniqueNames);
	}

	private static void addUniqueName(String name, Set<String> uniqueNames) {
		if(uniqueNames.contains(name)) 
			uniqueNames.remove(name);
		else 
			uniqueNames.add(name);
	}
	public static void uniqueNames(Set<String> uniqueNames) {
		for(String uniqueName : uniqueNames) 
			System.out.println(uniqueName);
	}
}
