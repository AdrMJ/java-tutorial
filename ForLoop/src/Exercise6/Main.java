package Exercise6;

public class Main {

	public static void main(String[] args) {
		// change method from Exercise5 so that method will accept two-dimension array with type int[][]
		int[][] numbers = {
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5}
		};
		System.out.println(sumOfAllElements(numbers));
	}
	public static int sumOfAllElements(int[][] array) {
		int sumOfAllElements = 0;
		for(int[] oneDimensionTable : array) {
			for(int number : oneDimensionTable) {
			sumOfAllElements += number;
			}
		}
		
		return sumOfAllElements ;
	}

}
