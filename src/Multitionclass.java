public class Multitionclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		multition m = multition.getInstance(2);
		System.out.println(m);

	}

}

class multition {
	private multition() {
	}

	private static multition mul1 = new multition();
	private static multition mul2 = new multition();

	public static multition getInstance(int key) {
		switch (key) {
		case 1:
			return mul1;
		case 2:
			return mul2;
		default:
			return null;
		}
	}

}