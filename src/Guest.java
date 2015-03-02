
public class Guest extends Card {

	public Guest(String firstName, String lastName, int pinCode) {
		super(firstName, lastName, 9999);
		
	}
	
	public boolean checkPIN(int pinCode){
		return false;
	}
	//fast kode 9999, men tidsbegrenset til ei uke 
	// sperrede kort = ingen tilgang
}
