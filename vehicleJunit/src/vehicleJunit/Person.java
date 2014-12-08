package vehicleJunit;
import java.util.UUID;


public class Person {
	
	
	
	private String FirstName;
	private String LastName;
	private UUID PersonID;

	public String getFirstName()
	{
	    return this.FirstName;
	}
	public void setFirstName(String firstName)
	{
	     this.FirstName = firstName;
	}
	
	public String getLastName()
	{
	    return this.LastName;
	}
	public void setLastName(String lastName)
	{
	     this.LastName = lastName;
	}
	public UUID getPersonID()
	{
	    return this.PersonID;
	}
	
	public void setPersonID()
	{
		
		UUID uuid = UUID.randomUUID();   
	     this.PersonID = uuid;
	}
}
