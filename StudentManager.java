package kodlamaioHomeWork;


	public class StudentManager extends UserManager{

		public void enterTheCourse(Student student) {
			System.out.println("Sayın "+student.getUserName()+" , "+student.getStudentOfCourse()+" isimli kursa kayıt oldunuz.");
		}
		
		public void leftTheCourse(Student student) {
			System.out.println("Sayın "+student.getUserName()+" , "+student.getStudentOfCourse()+" isimli kursutan kaydınızı sildiniz.");
		}

}
