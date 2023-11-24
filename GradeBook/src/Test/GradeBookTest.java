package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Main.GradeBook;
import Main.Subject;

public class GradeBookTest {
	GradeBook gradeBook;
	Subject polishLanguage;
	Subject englishLanguage;
	Subject germanLanguage;
	Double expectedAverage;
	
	@Before
	public void setUp() {
		gradeBook = new GradeBook();
		
		polishLanguage = new Subject("polishLanguage");
		polishLanguage.addGrade(3);
		polishLanguage.addGrade(3);
		polishLanguage.addGrade(3);
		polishLanguage.addGrade(3);
		gradeBook.addSubject(polishLanguage);
		
		englishLanguage = new Subject("englishLanguage");
		englishLanguage.addGrade(3);
		englishLanguage.addGrade(3);
		englishLanguage.addGrade(3);
		englishLanguage.addGrade(3);
		
		gradeBook.addSubject(englishLanguage);
		
		germanLanguage = new Subject("germanLanguage");
		gradeBook.addSubject(germanLanguage);
		
		germanLanguage.addGrade(3);
		germanLanguage.addGrade(3);
		germanLanguage.addGrade(3);
		germanLanguage.addGrade(3);
		
	}
	
	@Test
	public void shouldBeAbleToAddSubject() {
		Subject firstSubject = gradeBook.getSubject(1);
		
		assertEquals(polishLanguage, firstSubject);
	}
	
	@Test
	public void shouldBeAbleToCalculateAverage() {
		expectedAverage = 3.0;
	
		assertEquals(expectedAverage, gradeBook.calculateAverage());
	}
	@Test
	public void shouldBeAbleToCalculateAverageWithClearSubject() {
		germanLanguage.clearSubject();
		expectedAverage = 2.0;
		
		assertEquals(expectedAverage, gradeBook.calculateAverage());
	}
}
