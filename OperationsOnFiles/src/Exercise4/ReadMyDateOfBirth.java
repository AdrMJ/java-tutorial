package Exercise4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadMyDateOfBirth {
	public static void main(String[] args) throws IOException{
		String filePath = "C:\\Users\\Jan Kochanowski\\eclipse-workspace\\OperationsOnFiles\\src\\Exercise1\\saveMyLine.txt";
		DataInputStream input = null;
		int birthDay = 0;
		int birthMonth = 0;
		int birthYear = 0;
		
		try {
		input = new DataInputStream(new FileInputStream(filePath));
			birthDay = input.readInt();
			birthMonth = input.readInt();
			birthYear = input.readInt();
			
		} finally {
			if(input != null) {
				input.close();
			}
		}
		System.out.println("Day: ");
		System.out.println(birthDay);
		System.out.println("Month: ");
		System.out.println(birthMonth);
		System.out.println("Year: ");
		System.out.println(birthYear);
	}
}

