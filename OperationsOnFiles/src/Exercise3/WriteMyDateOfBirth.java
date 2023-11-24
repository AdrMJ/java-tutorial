package Exercise3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteMyDateOfBirth {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		String filePath = "";
		DataOutputStream output = null;
		
		System.out.println("Write file path: ");
		filePath = scanner.nextLine();
		try {
			output = new DataOutputStream(new FileOutputStream(filePath));
			
			System.out.println("Write day of date your birth");
			output.writeInt(scanner.nextInt());
			
			System.out.println("Write month of date your birth");
			output.writeInt(scanner.nextInt());
			
			System.out.println("Write year of date your birth");
			output.writeInt(scanner.nextInt());
			
			
		} finally {
			
			if(output != null) {
				output.close();
			}
		}
	}
}
