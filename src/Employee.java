import java.util.GregorianCalendar;


public class Employee extends Card {
	
	private GregorianCalendar calendar;

	public Employee(String firstName, String lastName, int pinCode) {
		super(firstName, lastName, 1234);
		GregorianCalendar time = new GregorianCalendar();
		time.add(GregorianCalendar.DAY_OF_MONTH, 7);
		calendar = (GregorianCalendar) time.clone();
		time = null;
		
		
		
		// setTimeHelper metode
		
		//isOfficeHours metode
		//isWeekDay metode, begge i timehelper-klasse(implementerer et interface(timeAware))
		//dermed i 
		
		//new TimeHelperMock(true, true) (weekdays, officehouers) 
		
	}
		// alltid gyldig i kontortiden (07.00-17.00) paa hverdagene. Utenfor denne tiden: maa taste kode, men utloeper ikke paa tid. 
	// sperrede kort = ingen tilgang
	@Override
	public boolean checkPIN(int pinCode){
		return false;
	}
	
	
}
