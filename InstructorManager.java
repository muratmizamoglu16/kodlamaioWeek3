package kodlamaioHomeWork;

	public class InstructorManager extends UserManager{
		
		public void startTheCourse(Instructor instructor) {
			
			System.out.println("Sayýn "+instructor.getUserName()+" , "+instructor.getInstructorOfCourse()+" isimli kursunuz açýldý.");
		}
		
		public void endTheCourse(Instructor instructor) {
			System.out.println("Sayýn "+instructor.getUserName()+" , "+instructor.getInstructorOfCourse()+" isimli kursunuz baþarýyla sonlandýrýldý.");
		}
		
}
