package �dev;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.id=1;
		student.firstName="gizem";
		student.lastName="bostan";
		student.email="gizem@a.com";
		student.studentNumber=313914;
		student.point=78;
		
		Instructor �nstructor=new Instructor();
		�nstructor.id=2;
		�nstructor.firstName="engin";
		�nstructor.lastName="demiro�";
		�nstructor.email="engin@a.com";
		�nstructor.courseName="java";
		
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager �nstructorManager=new InstructorManager();
		userManager.add(student);
		studentManager.givePoint(student);
		�nstructorManager.choose(�nstructor);

	}

}
