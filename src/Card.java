
public abstract class Card {
	private String firstName, lastName;
	private int pinCode, cardNumber;
	private boolean cardSuspended;
	private static int currentCardNumber = 100;
	
	//la klassen selv generere unike kortnummer (bruk en static variabel)
	
	
	public Card(String firstName, String lastName, int pinCode){
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinCode = pinCode;
		this.cardNumber = currentCardNumber++;
		this.setCardSuspenden(false);
		//cardActive();
	}
	

	public String getName(){
		return this.firstName + " " + this.lastName;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getPinCode(){
		return this.pinCode;
	}
	public int getCardNumber(){
		return cardNumber; 
	}
	public void setPinCode(int pinCode){
		 this.pinCode = pinCode;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	private void setCardSuspenden(boolean cardSuspended) {
		this.cardSuspended = cardSuspended;	
	}
	public boolean isSuspended(){
		return cardSuspended;
	}
	
	public String toString(){
		String output = "Name: " + getName() + " has cardnumber: " + getCardNumber() +  " and pincode: " + getPinCode() + " Suspended: " + isSuspended();
		return output;
	}
	
	public abstract boolean checkPIN(int pinCode); 
	
	public boolean checkPin(int pinCodeNumber){
		if(pinCodeNumber == this.getPinCode()){
			return true;
		}
		return false;
	}
	
}
