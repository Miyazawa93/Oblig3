import java.util.GregorianCalendar;


public class Employee extends Card {
	
	private GregorianCalendar calendar = new GregorianCalendar();
	private GregorianCalendar time = new GregorianCalendar();

	public Employee(){
	}
	public Employee(String firstName, String lastName, int pinCode) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPinCode(pinCode);
		this.setCardSuspended(false);	
	}
	
	@Override
	public boolean checkPIN(int pinCode){
		if(pinCode == this.getPinCode()){
			return true;
		}else{
		return false;
		}
	}
	public boolean isAccessGranted(){
		if(checkOffiseTime() && checkPIN(getPinCode()) == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean checkOffiseTime(){
		if(isSuspended()){
			return false;
		}
		if(isItWorkHour() && checkWeekDay() == true){
			return true;
		}
		else{
			return false;
		}
			
	}
	public boolean isItWorkHour(){
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		if(hour >= 7 && hour <=17){
			return true;
		}
	else{
		return false;
	}
}
	
	public boolean checkWeekDay(){
		int day = calendar.get(calendar.DAY_OF_WEEK);
		if(day >= 2 && day <= 6){
			return true;
		}else{
			return false;
		}
	}
	
	
}
