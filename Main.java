package kodlamaioHomeWork;

import kodlamaioHomeWork.Instructor;
import kodlamaioHomeWork.InstructorManager;
import kodlamaioHomeWork.Student;
import kodlamaioHomeWork.StudentManager;
import kodlamaioHomeWork.User;
import kodlamaioHomeWork.UserManager;

public class Main {

	public static void main(String[] args) {
		
		User user=new User();
		user.setId(1);
		user.setUserNumber(100);
		user.setUserName("Murat");
		user.setLastName("Mizamoðlu");
		user.setUserMail("xxx@gmail.com");
		user.setPassword("123456789");
		
		Instructor instructor=new Instructor();
		instructor.setId(2);
		instructor.setUserNumber(200);
		instructor.setUserName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setUserMail("yyy@gmail.com");
		instructor.setPassword("123123123");
		instructor.setInstructorOfCourse("Java ve React");
		instructor.setCapacityOfManagedCourse(3000);
		
		Student student=new Student();
		student.setId(3);
		student.setUserNumber(300);
		student.setUserName("Ahmet");
		student.setLastName("Pamukoðlu");
		student.setUserMail("zzz@gmail.com");
		student.setPassword("111111111");
		student.setStudentOfCourse("C# ve .NET");
		student.setCapacityOfEnrolledCourse(200);
		
		
		
		UserManager userManager=new UserManager();
		userManager.signIn(user);
		userManager.signUp(user);
		userManager.show(user);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.startTheCourse(instructor);
		instructorManager.endTheCourse(instructor);
		instructorManager.show(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.enterTheCourse(student);
		studentManager.leftTheCourse(student);
		studentManager.show(student);
		
		
	}
	



}
