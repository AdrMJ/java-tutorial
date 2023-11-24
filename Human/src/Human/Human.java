package Human;

public class Human {
    private String firstName;
    private String lastName;
    private Long personalIdNumber;
 
    public Human(String firstName, String lastName, Long personalIdNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalIdNumber = personalIdNumber;
    }   
 
    public String getFirstName() {
        return firstName;
    }   
 
    public String getLastName() {
        return lastName;
    }   
 
    public Long getPersonalIdNumber() {
        return personalIdNumber;
    }
    @Override
    public boolean equals(Object obj) {
    	if (obj instanceof Human) {
    		Human otherHuman = (Human)obj;
    		return personalIdNumber.equals(otherHuman.personalIdNumber);
    	} else {
    		return false;
    	}
    }
    @Override
    public int hashCode() {
    	return 3 * firstName.hashCode() + 7 * lastName.hashCode() + 11 * personalIdNumber.hashCode();
    }
}