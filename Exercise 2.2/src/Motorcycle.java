import java.util.Scanner;

public class Motorcycle {
	String brand;
	String colour;
	String type;
	int distance;
	
	void canMove() {
		System.out.println("Can move forward.");
	}
	void distperlitre(int f) {
		distance = 500/f;
		System.out.println("Distance per litre from 500km : " + distance + "km's");
	}
	void capacity(int h) {
		System.out.println("Motorcycle cubic capacity  : " + h + "cc");
	}
	
	void printMotorcycle(String b, String c, String t) {
		System.out.println("Brand :" + b);
		System.out.println("Colour :" + c);
		System.out.println("Type :" + t);
		canMove();
		
	}

}
