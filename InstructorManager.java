package kodlamaioHomeWork;

	public class InstructorManager extends UserManager{
		
		public void startTheCourse(Instructor instructor) {
			
			System.out.println("Say�n "+instructor.getUserName()+" , "+instructor.getInstructorOfCourse()+" isimli kursunuz a��ld�.");
		}
		
		public void endTheCourse(Instructor instructor) {
			System.out.println("Say�n "+instructor.getUserName()+" , "+instructor.getInstructorOfCourse()+" isimli kursunuz ba�ar�yla sonland�r�ld�.");
		}
		
}
