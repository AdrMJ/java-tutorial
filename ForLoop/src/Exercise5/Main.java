package Exercise5;

public class Main {

	public static void main(String[] args) {
		// Write method with one argument(type int[]) which will return sum of array's elements
		int[] numbers = {-3, -1, 0, 3, 6, 7};
		System.out.println(sumOfElements(numbers));
		
	}
	public static int sumOfElements(int[] array) {
		int sumOfElements = 0;
		for(int i = 0; i < array.length; i++) {
			sumOfElements+=array[i];
		}
		
		return sumOfElements;
	}
}
