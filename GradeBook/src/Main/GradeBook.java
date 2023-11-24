package Main;

import java.util.LinkedList;
import java.util.List;

public class GradeBook {
	private Double average = 0.0;
	private List<Subject> subjects = new LinkedList<>();
	
	private final Double SIZEOFLIST = (double) subjects.size();

	public void addSubject(Subject subject) {
		if(subjects.contains(subject)) {
			throw new IllegalArgumentException("You can't add a same subject twice!");
		}
		this.subjects.add(subject);
	}
	public Subject getSubject(int index) {
		return subjects.get(index-1);
	}
	
	public Double calculateAverage() {
		for(Subject subject : subjects) {
			average += subject.calculateAverage();
		}
		return average/SIZEOFLIST;
	}
}
