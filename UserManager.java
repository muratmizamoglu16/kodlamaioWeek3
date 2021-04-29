package kodlamaioHomeWork;


public class UserManager {
	

		public void signIn(User user) {
			
			System.out.print("Merhaba "+user.getUserName()+" baþarýyla giriþ yaptýnýz.\n");
		}
		
		public void signUp(User user) {
			
			System.out.println("Merhaba "+user.getUserName()+" baþarýyla kaydýnýz oluþturuldu.");
		}

		public void show(User user) {
			System.out.println("Numaranýz : "+user.getUserNumber()+" , E-postanýz: "+user.getUserMail()+"\n");
		}

}
