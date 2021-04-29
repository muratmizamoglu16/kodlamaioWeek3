package kodlamaioHomeWork;


public class Instructor {



		String instructorOfCourse;
		int capacityOfManagedCourse;
		
		public Instructor() {
			
		}

		public Instructor(String instructorOfCourse, int capacityOfManagedCourse) {
			super();
			this.instructorOfCourse = instructorOfCourse;
			this.capacityOfManagedCourse = capacityOfManagedCourse;
		}

		public String getInstructorOfCourse() {
			return instructorOfCourse;
		}

		public void setInstructorOfCourse(String instructorOfCourse) {
			this.instructorOfCourse = instructorOfCourse;
		}

		public int getCapacityOfManagedCourse() {
			return capacityOfManagedCourse;
		}

		public void setCapacityOfManagedCourse(int capacityOfManagedCourse) {
			this.capacityOfManagedCourse = capacityOfManagedCourse;
		}
		
		
}
