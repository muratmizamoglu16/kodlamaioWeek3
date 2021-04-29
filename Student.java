package kodlamaioHomeWork;


public class Student {
		
		String studentOfCourse;
		int capacityOfEnrolledCourse;
		
		public Student() {
			
		}

		public Student(String studentOfCourse, int capacityOfEnrolledCourse) {
			super();
			this.studentOfCourse = studentOfCourse;
			this.capacityOfEnrolledCourse = capacityOfEnrolledCourse;
		}

		public String getStudentOfCourse() {
			return studentOfCourse;
		}

		public void setStudentOfCourse(String studentOfCourse) {
			this.studentOfCourse = studentOfCourse;
		}

		public int getCapacityOfEnrolledCourse() {
			return capacityOfEnrolledCourse;
		}

		public void setCapacityOfEnrolledCourse(int capacityOfEnrolledCourse) {
			this.capacityOfEnrolledCourse = capacityOfEnrolledCourse;
		}
		

}
