
public class Main {

	public static void main(String[] args) {
		
		Motorcycle Sportbike = new Motorcycle(); //create first new object Sportbike
		
		Sportbike.printMotorcycle("Honda", "Blue", "Sportbike");
		Sportbike.distperlitre(50);
		Sportbike.capacity(998);
	
		System.out.println();
		
		Motorcycle Scooter = new Motorcycle(); //create second new object Scooter
		
		Scooter.printMotorcycle("BMW", "Red", "Scooter");
		Scooter.distperlitre(65);
		Scooter.capacity(647);
		
		System.out.println();
		
		Motorcycle Offroad = new Motorcycle(); //create third new object Offroad
		
		Offroad.printMotorcycle("KTM", "Yellow", "Offroad");
		Offroad.distperlitre(30);
		Offroad.capacity(450);

	}

}
