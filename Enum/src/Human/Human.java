package Human;

public class Human{
	private String name = "";
	private int age = 0;
	private EyeColor eyeColor;
	private HairColor hairColor;
	
	public Human(String name, int age, EyeColor eyeColor, HairColor hairColor) {
		this.name = name;
		this.age = age;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public EyeColor getEyeColor() {
		return eyeColor;
	}
	public HairColor getHairColor() {
		return hairColor;
	}
}
