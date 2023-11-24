package Exercise2;

public class Main {
	public static void main(String[] args) {
		int x = 0;
		int[][][] tables = new int[2][2][2];
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < 2; i++) {
				for(int h = 0; h < 2; h++) {
					tables[j][i][h] = x++;
				}
			}
		}
		System.out.println(sumOfThreeDimensionalArray(tables));
	}
	public static int sumOfThreeDimensionalArray(int[][][] table) {
		int theHighestNumber = 0;
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < 2; i++) {
				for(int h = 0; h < 2; h++) {
					if(table[j][i][h] > theHighestNumber) {
						theHighestNumber = table[j][i][h];
					}
				}
			}
		}
		return theHighestNumber;
	}
}
