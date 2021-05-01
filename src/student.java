
public class student extends user {
	
	String cardNo;
	String place;
	
	public student(int id, String firstName, String LastName, String eMail, String password, String place, String cardNo) {
		super(id, firstName, LastName, eMail, password);
		this.place = place;
		this.cardNo = cardNo;
	}
	

	public String getplace() {
		return place;
}
	public void setAdress(String place) {
		this.place = place;
}
	public String getcardNo() {
		return cardNo;
}
	public void setcardNo(String cardNo) {
		this.cardNo = cardNo;
}

}

