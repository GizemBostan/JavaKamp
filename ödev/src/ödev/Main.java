package ödev;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.id=1;
		student.firstName="gizem";
		student.lastName="bostan";
		student.email="gizem@a.com";
		student.studentNumber=313914;
		student.point=78;
		
		Instructor ınstructor=new Instructor();
		ınstructor.id=2;
		ınstructor.firstName="engin";
		ınstructor.lastName="demiroğ";
		ınstructor.email="engin@a.com";
		ınstructor.courseName="java";
		
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager ınstructorManager=new InstructorManager();
		userManager.add(student);
		studentManager.givePoint(student);
		ınstructorManager.choose(ınstructor);

	}

}
