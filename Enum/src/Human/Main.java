package Human;

public class Main {

	public static void main(String[] args) {
		Human woman = new Human("Katarzyna", 20, EyeColor.BLUE, HairColor.BLONDE);
		System.out.println(woman.getName());
		System.out.println(woman.getAge());
		System.out.println(woman.getEyeColor());
		System.out.println(woman.getHairColor());

	}
	
}
