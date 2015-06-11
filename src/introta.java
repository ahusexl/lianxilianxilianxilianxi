public class introta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 12345;

		System.out.println(rotate(i));
	}

	public static int rotate(int a) {
		int sum = 0;
		while (a != 0) {
			sum = sum * 10 + a % 10;
			a /= 10;
		}
		return sum;
	}
}
