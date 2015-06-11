package Factory;

public class DriveCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car c=Factory.getInstance("Bmw");
		c.drive();

	}

}
