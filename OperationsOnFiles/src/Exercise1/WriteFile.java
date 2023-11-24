package Exercise1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		String filePath = "C:\\Users\\Jan Kochanowski\\eclipse-workspace\\OperationsOnFiles\\src\\Exercise1\\saveMyLine.txt";
		String newLine = "";
		FileWriter fileWriter = null;
		
		System.out.println("Write file path ");
		
		while(!newLine.equals("-")) {
			try {
				fileWriter = new FileWriter(scanner.nextLine());
				System.out.println("Write file content ");
				while(true) {
					newLine = scanner.nextLine();
					if (newLine.equals("-")) {
						break;
					}
					fileWriter.write(newLine);
					fileWriter.write(System.lineSeparator());
				}
			} finally {
				if (fileWriter != null) {
					fileWriter.close();
				}
			}
		}
		
		scanner.close();
	}
}
