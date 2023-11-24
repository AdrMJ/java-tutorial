package Main;

import java.util.LinkedList;
import java.util.List;

public class Subject {
	private String name = "";
	private Double result = 0.0;
	private List<Integer> grades = new LinkedList<>();
	private List<Integer> emptyList = new LinkedList<>();
	
	public Subject(String name) {
		this.name=name;
	}
	
	public void addGrade(int grade){
		if(grade < 7 && grade > 0) {
			grades.add(grade);
		}else {
			throw new IllegalArgumentException("Grade can't be better than 6 and lower than 1");
		}
	}
	public String getName() {
		return name;
	}
	
	public int getGrade(int index) {
		return(grades.get(index-1));
	}
	
	public boolean hasGrades() {
		if(grades == emptyList) {
			return false;
		} 
		return true;
	}
	
	public Double calculateAverage() {
		if(hasGrades()) {
			for(Integer grade : grades) {
				result += grade;
			}
			return (Double)(result/grades.size());
		} 
		return 0.0;
	}
	
	public void deleteGrade(int index) {
		grades.remove(index);
	}
	
	public void clearSubject() {
		grades.clear();
	}
	
}
