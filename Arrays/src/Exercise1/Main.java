package Exercise1;

public class Main {

	public static void main(String[] args) {
		
		int[][]	tables = new int[2][2];
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < 2; i++) {
				tables[j][i] = 3;
			}
		}
		System.out.println(sumOfTwoDimensionalArray(tables));
	}
	public static int sumOfTwoDimensionalArray(int[][] table) {
		int sumOfArray = 0;
		for(int k = 0; k < 2; k++) {
			for(int l = 0; l < 2; l++) {
				sumOfArray += table[k][l];
			}
		}
		return sumOfArray;
	}

}
