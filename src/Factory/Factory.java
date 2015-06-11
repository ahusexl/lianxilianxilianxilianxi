package Factory;

public class Factory {

	public static Car getInstance(String s) {
		switch (s) {
		case "Benze":
			return new Benz();
		case "Bmw":
			return new Bmw();
		default:
			return null;
		}

	}
}
