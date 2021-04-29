package kodlamaioHomeWork;

public class User {


		int id;
		int userNumber;
		String userName;
		String lastName;
		String userMail;
		String password;
		
		public User() {
			
		}

		
		public User(int id, int userNumber, String userName, String lastName, String password, String userMail) {
			super();
			this.id = id;
			this.userNumber = userNumber;
			this.userName = userName;
			this.lastName = lastName;
			this.password = password;
			this.userMail = userMail;
			
			
		}
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getUserNumber() {
			return userNumber;
		}

		public void setUserNumber(int userNumber) {
			this.userNumber = userNumber;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUserMail() {
			return userMail;
		}

		public void setUserMail(String userMail) {
			this.userMail = userMail;
		}
}
