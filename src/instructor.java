
public class instructor extends user{

	String course;

	public void Instructor() {

	}
	public instructor(int id, String firstName, String lastName, String eMail, String password, String course) {
		super(id, firstName, lastName, eMail, password);
		this.course = course;
	}

	
	public String getCourse() {
		return course;
}

	public void setCourse(String course) {
		this.course = course;
}


} 