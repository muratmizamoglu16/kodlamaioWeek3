package kodlamaioHomeWork;


public class UserManager {
	

		public void signIn(User user) {
			
			System.out.print("Merhaba "+user.getUserName()+" ba�ar�yla giri� yapt�n�z.\n");
		}
		
		public void signUp(User user) {
			
			System.out.println("Merhaba "+user.getUserName()+" ba�ar�yla kayd�n�z olu�turuldu.");
		}

		public void show(User user) {
			System.out.println("Numaran�z : "+user.getUserNumber()+" , E-postan�z: "+user.getUserMail()+"\n");
		}

}
