package vehicle;
public class TestVehicle {

	public static void main(String[] args){
		
		Person a = new Person();
		a.setFirstName("a");
		a.setLastName("Burb");
		a.setPersonID();
		Car Focus = new Car();
		Focus.Owner = a;
		Focus.NumberOfDoors = 4;
		System.out.print("Focus Owner is:"+" "+ Focus.Owner.getFirstName()+" "+ Focus.Owner.getLastName()+"\n");
		Person b = new Person();
		b.setFirstName("b");
		b.setLastName("jackson");
		b.setPersonID();
		Truck Dodge = new Truck();
		Dodge.NumberOfAxles = 2;
		Dodge.Owner = b;
		Focus.transferOwnership(b);
		Motorcycle Suzuki = new Motorcycle();
		Suzuki.HasSideCar = false;
		System.out.print("Focus New Owner is:"+" "+ Focus.Owner.getFirstName()+" "+ Focus.Owner.getLastName()+"\n");
		System.out.print("Dodge Owner is:"+" "+Dodge.Owner.getFirstName()+" "+ Dodge.Owner.getLastName()+"\n");
		System.out.print("Focus # Of Doors:"+" "+Focus.NumberOfDoors+"\n");
		System.out.print("Does a Suzuki have a SideCar?"+" "+Suzuki.HasSideCar+"\n");
		
		
	}
}
