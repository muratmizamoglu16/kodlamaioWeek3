package kodlamaioHomeWork;


	public class StudentManager extends UserManager{

		public void enterTheCourse(Student student) {
			System.out.println("Say�n "+student.getUserName()+" , "+student.getStudentOfCourse()+" isimli kursa kay�t oldunuz.");
		}
		
		public void leftTheCourse(Student student) {
			System.out.println("Say�n "+student.getUserName()+" , "+student.getStudentOfCourse()+" isimli kursutan kayd�n�z� sildiniz.");
		}

}
