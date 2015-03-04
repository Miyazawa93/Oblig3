import java.util.GregorianCalendar;


public class Guest extends Card {
	
	private GregorianCalendar calendar  = new GregorianCalendar();
	private GregorianCalendar expireTime  = new GregorianCalendar();
	
	public Guest(String firstName, String lastName, int pinCode) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPinCode(pinCode);
		this.setCardSuspended(false);
		expireTime.add(calendar.DAY_OF_YEAR, 7);
	}
	
	public Guest() {
		this.setFirstName("Guest");
		this.setPinCode(9999);
		this.setCardSuspended(false);
		expireTime.add(calendar.DAY_OF_YEAR, 7);
	}

	public boolean isAccessGrantes(){
		if(isSuspended()){
			return false;
		}
		if(calendar.getTime().after(expireTime.getTime())){
			setCardSuspended(true);
			return false;
		}else{
		return true;
		}
	}
	
	@Override
	public boolean checkPIN(int pinCode){
		if(pinCode == 9999){
			return true;
		}
		return false;
	}
}
