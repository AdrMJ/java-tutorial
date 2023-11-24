package Human;

public class Main {

	public static void main(String[] args) {
		
		Human man1 = new Human("Mariusz", "Kowalski", 54010629759L);
		Human woman = new Human("Katarzyna", "Czubówna", 54030629759L);
		Human man2 = new Human("Krzysztof", "Gońciarz", 54010629759L);
		
		System.out.println(man1.equals(man2));
		System.out.println(man1.equals(woman));
		System.out.println(man2.equals(man1));
		System.out.println(man2.equals(woman));
		System.out.println(woman.equals(man1));
		System.out.println(woman.equals(man2));
		
	}

}
