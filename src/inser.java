public class inser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 3, 6, 1, 9, 7 };
		int[] b = change(a);
		for (int i = 0; i < a.length; i++)
			System.out.println(b[i]);
	}

	private static int[] change(int[] a) {
		sort(a);
		int[] b = new int[a.length];
		int i = 0, j = a.length - 1;
		while (i < j) {
			for (int k = 0; k < a.length; k++) {

				if ((a.length) % 2 == 0) {
					if (k % 2 == 0)
						b[i++] = a[k];
					else
						b[j--] = a[k];
				} else {
					if (k % 2 == 1)
						b[i++] = a[k];
					else
						b[j--] = a[k];
				}
			}
		}
		return b;
	}

	private static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++)
			for (int j = a.length - 1; j > i; j--)
				if (a[j] < a[j - 1]) {
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
	}

}
