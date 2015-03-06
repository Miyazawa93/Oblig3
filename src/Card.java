public abstract class Card implements Comparable<Card>, Cloneable {
	private String firstName;
	protected String lastName;
	private String fullName;
	private int pinCode;
	private int cardNumber = (int) (Math.random()*10);
	private boolean cardSuspended;
	private static int currentCardNumber = 100;
	private static int cards;
	
	
	public Card(String fullName, int pinCode){
		this.fullName = fullName;
		this.pinCode = pinCode;
		this.cardNumber = ++cards;
		this.setCardSuspended(false);
	}
	
	public Card(){
	}
	public String getFullName(){
		return fullName;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getPinCode(){
		return pinCode;
	}
	public int getCardNumber(){
		return cardNumber; 
	}
	public static int getCards() {
		return cards;
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
	public void setFullName(String fullName){
		this.fullName = fullName;
	}
	protected void setCardSuspended(boolean cardSuspended) {
		this.cardSuspended = cardSuspended;	
	}
	public boolean isSuspended(){
		return cardSuspended;
	}
	public static void setCards(int cardNumber){
		cards = cardNumber;
	}
	
	public String toString(){
		String output = "Name: " + getFullName() + " has card number: " + getCardNumber() +  " and pincode: " + getPinCode() + " Suspended: " + isSuspended();
		return output;
	}
	
	public abstract boolean checkPIN(int pinCode); 
	
	public boolean checkPin(int pinCodeNumber){
		if(pinCodeNumber == this.getPinCode()){
			return true;
		}else{
		return false;
		}
	}
	public int compareTo(Card card){
		if (getFullName().compareTo(card.getFullName()) == 0){
            return getFirstName().compareTo(card.getFirstName());
        } else {
            return getFullName().compareTo(card.getFullName());
        }
}
	
	@Override
	public Object clone() {
		try {
			Card cardClone = (Card) super.clone();
			cardClone.setFirstName(new String(this.getFirstName()));
			cardClone.setLastName(new String(this.getLastName()));
			return cardClone;
		} 
		catch (CloneNotSupportedException e) {
			return null;

		}
	}
}
