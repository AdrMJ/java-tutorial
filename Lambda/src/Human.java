import java.util.function.BiFunction;

public class Human {
 
    private int age;
    private String name;
 
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
    	BiFunction<Integer, String, Human> objectCreator = Human::new;
    	Human human = objectCreator.apply(12, "Mietek");
    	System.out.println(human.getName());
    	System.out.println(human.getAge());
    }
}
