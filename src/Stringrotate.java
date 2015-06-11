public class Stringrotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "abcdefg";

		System.out.println(rotate(a, 3));
	}

	public static String rotate(String a, int num) {
		char[] c = a.toCharArray();
		rota(c, 0, num - 1);
		rota(c, num, c.length - 1);
		rota(c, 0, c.length - 1);
		return new String(c);
	}

	public static void rota(char[] c, int i, int j) {

		while (i < j) {
			char t = c[i];
			c[i++] = c[j];
			c[j--] = t;
		}

	}
}
