
public class userManager {

		public void Login(int logType , user user) {
			if(logType ==1) {
				System.out.println("Ogrenci kaydiniz alindi.:" + user.firstName + " " + user.lastName);
			}
			else if (logType ==2) {
				System.out.println("Egitmen kaydiniz alindi.:" +user.firstName + " " + user.lastName);
			}
		}


		public void Delete(int logType , user user) {
			if(logType ==1) {
				System.out.println("Ogrenci kaydiniz silindi.:" + user.firstName + " " + user.lastName);
			}
			else if (logType ==2) {
				System.out.println("Egitmen kaydiniz silindi.:" +user.firstName + " " +user.lastName);
			}
		}

		public void Update(int logType , user user) {
			if(logType ==1) {
				System.out.println("Ogrenci kaydiniz güncellendi.:" + user.firstName + " " + user.lastName);
			}
			else if (logType ==2) {
				System.out.println("Egitmen kaydiniz güncellendi.:" +user.firstName + " " + user.lastName);
			}
		}

	}