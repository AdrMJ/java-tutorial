package Exercise4;

public class Main {

	public static void main(String[] args) {
		// Write odd numbers -10 to 40 with while loop
		int i = -10;
		while(i<=40) {
			if(i%2==1||i%2==-1) {
				System.out.println(i);
			}
			i++;
		}
	}

}
