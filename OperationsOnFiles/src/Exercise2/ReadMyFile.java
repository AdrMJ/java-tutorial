package Exercise2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadMyFile {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write file path: ");
		String file = scanner.nextLine();
		BufferedReader reader = null;
		String text;
		
		try {
			reader = new BufferedReader(new FileReader(file));
			text = reader.readLine();
		} finally {
			if(reader != null) {
				reader.close();
			}
		}
		System.out.print(text);
	}
}
