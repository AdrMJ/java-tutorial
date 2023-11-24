package Exercise;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Write program which will calculate the average of grades. Student has three subjects and four grades.
		int[][] gradesOfUser = new int[3][4];
		
		newGradesArray(gradesOfUser);
		averageOfGrades(gradesOfUser);
		}
		
	public static int[][] newGradesArray(int[][] newGradesArray){
		try (Scanner scanner = new Scanner(System.in)) {
			for(int i = 0; i<newGradesArray.length; i++) {
				for(int j = 0; j<=newGradesArray.length; j++) {
					newGradesArray[i][j] += scanner.nextInt();
					if(newGradesArray[i][j] > 6) {
						System.out.println("Podano złą wartość");
						return null;
					}
				}
			}
		}
		
		return newGradesArray;
	}
	
	public static void averageOfGrades(int[][] grades) {
		int sumOfGrades = 0;
		float averageOfGrades = 0.0f;
		int numberOfClasses = 3;
		int numberOfNotes = 4;
		for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
		    for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++) {
		    	sumOfGrades += grades[classIndex][noteIndex];
		    	if(noteIndex == 3) {
		        	averageOfGrades = ((float)sumOfGrades)/4; 
		        	System.out.println("Średnia z przedmiotu " + classIndex + " wynosi " +  averageOfGrades);
		        }
		    }
		}
	}

}
