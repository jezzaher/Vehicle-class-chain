package vehicleJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class vehicleJunit {

	@Test
	public void test() {
		
			Person a = new Person();
			a.setFirstName("a");
			a.setLastName("Burb");
			a.setPersonID();
			Car Focus = new Car();
			Focus.Owner = a;
			Focus.NumberOfDoors = 4;
			Person b = new Person();
			b.setFirstName("b");
			b.setLastName("Jackson");
			b.setPersonID();
			Truck Dodge = new Truck();
			Dodge.NumberOfAxles = 2;
			Dodge.Owner = b;
			Focus.transferOwnership(b);
			Motorcycle Suzuki = new Motorcycle();
			Suzuki.HasSideCar = false;
			   assertEquals("Person a first name is",
					   "a", a.getFirstName());
			   assertEquals("Person a last name is ",
					   "Burb", a.getLastName());
			   assertEquals("Person has a UUID",
					   a.getPersonID(), a.getPersonID());
			   assertEquals("Person b owns Focus",
					   "b", Focus.Owner.getFirstName());
			   assertEquals("Focus has 4 doors",
					   4, Focus.NumberOfDoors);
			   assertEquals("Dodge has 2 axles",
					   2, Dodge.NumberOfAxles);
			   assertEquals("Suzuki has no side car",
					   false, Suzuki.HasSideCar);
			
	}

}
