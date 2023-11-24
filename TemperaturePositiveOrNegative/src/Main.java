
public class Main {

	public static void main(String[] args) {
		
		int tem = -17;
		System.out.println("This temperature is " + isPositive(tem) + ".");
	

	}
	public static String isPositive(int tem) {
		if(tem>0) {
			return("positive");
		} else if(tem == 0){
			return("zero");
		} else {
			return("negative");
		}
	}
}
