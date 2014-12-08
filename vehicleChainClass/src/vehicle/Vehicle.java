package vehicle;

public abstract class Vehicle implements VehicleInterface {

	String Name;
	String Color;
	double Weight;
	public Person Owner;
	
	protected void transferOwnership(Person Owner){
		
		this.Owner = Owner;
		
	}
	
	
	
}
