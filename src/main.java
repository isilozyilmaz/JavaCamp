public class main {

	public main(String[] args) {
		user user1 = new student(1,"isil","Özyılmaz","isil@hotail.com","1212","istanbul","20");
		user inst = new instructor(2, "Engin", "Demirog", "e@hotmail.com", "2323", "JAVA");


	userManager userManager1 =new userManager();
	userManager1.Login(1,user1);

	userManager userManager2 =new userManager();
	userManager2.Login(2,inst);

	studentManager studentManager = new studentManager();
	studentManager.addCard(user1);
	studentManager.place(user1);

	InstructorManager instructorManager = new InstructorManager();
	instructorManager.addCourse(inst);

	}
}