
public interface Permanent {
	
	public String getFirstName();
	
	public void setFirstName(String firstName);
	
	public String getLastName();
	
	public void setLastName(String lastName);
	
	public String getFullName();
			
	public void setFullName(String fullName);
	
	static final double CONSTANT= 1.5; 
	
	public double calculateCredit();
	
	public double calculateBonus();	

}
