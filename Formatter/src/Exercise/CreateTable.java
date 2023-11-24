package Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;

public class CreateTable implements Iterable<Object[]>{
	private final BufferedReader reader;
	
	private Object[] currentLine;
	
	public CreateTable(InputStream inputStream) {
		reader = new BufferedReader(new InputStreamReader(inputStream));
	}
	public static void main(String[] args) throws IOException {
		URL resource = CreateTable.class.getResource(File.separator + "file.csv");
		try(InputStream inputStream = resource.openStream()){
			for(Object[] columns : new CreateTable(inputStream)) {
				System.out.format("| %1$-8s | %2$-7.2f | %3$-12s |%n", columns);
			}
		}
	}
	 @Override
	 public Iterator<Object[]> iterator() {
	        return new Iterator<Object[]>() {
	            @Override
	            public boolean hasNext() {
	                String line = null;
	                try {
	                    line = reader.readLine();
	                } catch (IOException e) {
	                    throw new RuntimeException(e);
	                }
	                if (line == null) {
	                    currentLine = null;
	                    return false;
	                }
	                String[] splittedLine = line.split(",");
	                currentLine = new Object[] {
	                        splittedLine[0],
	                        Float.valueOf(splittedLine[1]),
	                        splittedLine[2]
	                };

	                return true;
	            }

	            @Override
	            public Object[] next() {
	                return currentLine;
	            }
	        };
	 }
}
