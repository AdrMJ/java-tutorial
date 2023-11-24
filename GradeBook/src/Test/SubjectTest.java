package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import Main.Subject;

public class SubjectTest {
	Subject polishLanguage;
	
	@Before
	public void setUp() {
		polishLanguage = new Subject("polski");
	}
	
	@Test
	public void shouldBeAbleToCreateSubject() {
		
		assertNotNull(polishLanguage);
	}
	
	@Test
	public void shouldBeAbleToAddNewGrade() {
		int grade = 1;
		polishLanguage.addGrade(grade);
		
		assertEquals(grade, polishLanguage.getGrade(1));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldntBeAbleToAddTooHighIntAsGrade() {
		int tooHighGrade = 7;
		polishLanguage.addGrade(tooHighGrade);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldntBeAbleToAddTooLowIntAsGrade(){
		int tooLowGrade = 0;
		polishLanguage.addGrade(tooLowGrade);
	}
	
	@Test
	public void shouldBeAbleToCalculateAverageOfGradesForSubject() {
		int firstGrade = 2;
		int secondGrade = 4;
		int thirdGrade = 6;
		Double expected = 4.0;
		
		polishLanguage.addGrade(firstGrade);
		polishLanguage.addGrade(secondGrade);
		polishLanguage.addGrade(thirdGrade);
		
		assertEquals(expected, polishLanguage.calculateAverage());
	}
	
}
