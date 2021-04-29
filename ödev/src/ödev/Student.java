package ödev;

public class Student extends User{
	int studentNumber;
	String schoolName;
	int point;
	
	
	public Student(int id, String firstName, String lastName, String email, String password, int studentNumber,
			String schoolName,int point) {
		super(id, firstName, lastName, email, password);
		this.studentNumber = studentNumber;
		this.schoolName = schoolName;
		this.point=point;
	}
	
	public Student() {
			
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	} 

}
