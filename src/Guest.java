import java.util.GregorianCalendar;
import java.util.StringTokenizer;


public class Guest extends Card {
	
	private GregorianCalendar calendar  = new GregorianCalendar();
	private GregorianCalendar expireTime  = new GregorianCalendar();
	
	public Guest() {
		this.setFullName("Guest");
		this.setPinCode(9999);
		this.setCardSuspended(false);
		expireTime.add(calendar.DAY_OF_YEAR, 7);
	}
	
	public Guest(String fullName, int pinCode) {
		super.setFullName(fullName);
		this.setPinCode(pinCode);
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

	@Override
	public Object clone() {
			Guest guestClone = (Guest) super.clone();
			guestClone.calendar = (GregorianCalendar) this.calendar.clone();
			
		return guestClone;
	}
	
}
