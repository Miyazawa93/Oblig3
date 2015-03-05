import java.util.GregorianCalendar;
import java.util.StringTokenizer;


public class Employee extends Card implements Permanent {
	
	private GregorianCalendar calendar = new GregorianCalendar();
	private GregorianCalendar time = new GregorianCalendar();
	private GregorianCalendar workedHours;
	private double payment;
	private String fullName;
	String lastName;

	public Employee(String fullName, int pinCode) {
		super.setFullName(fullName);
		this.setPinCode(pinCode);
		this.setCardSuspended(false);
	}
	
	public Employee() {	
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
		}else{
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
	@Override
	public String getFirstName(){
		return super.getFirstName();
	}
	@Override
	public void setFirstName(String firstName) {
		super.setFirstName(firstName);
	}
	@Override
	public String getLastName(){
		return super.getLastName();
	}
	@Override
	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}
	
	@Override
	public String getFullName() {
		return super.getFullName();
	}
	@Override
	public void setFullName(String fullName) {
		StringTokenizer letters = new StringTokenizer(fullName);
		super.setFirstName(letters.nextToken());
		
		while(letters.hasMoreTokens())
			super.lastName = letters.nextToken();
		
		super.setLastName(lastName);
	}
	
	@Override
	public double calculateCredit() {
		double hourPayment = CONSTANT * payment;
		return hourPayment;
	}
	@Override
	public double calculateBonus() {
		int yearsEmployed = time.get(GregorianCalendar.YEAR) - calendar.get(GregorianCalendar.YEAR);
		
		return CONSTANT * yearsEmployed;
		
		
	}

	@Override
	public Object clone() {
			Employee employeeClone = (Employee) super.clone();
			employeeClone.calendar = (GregorianCalendar) this.calendar.clone();
			
		return employeeClone;
	}
	
}

