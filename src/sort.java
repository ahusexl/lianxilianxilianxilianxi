public class sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int b;
		int[] a = { 4, 3, 2, 11, 6, 8, 9, 7, 5 };
		// bobblesort(a);
		// selectsort(a);
		//insersort(a);
		// for (int i = 0; i < a.length; i++)

		for (int i : a)
			System.out.print(i + " ");
	}

	public static void bobblesort(int[] a) {
		for (int i = 0; i < a.length - 1; i++)
			for (int j = a.length - 1; j > i; j--)
				if (a[j] < a[j - 1])
					swap(a, j, j - 1);
	}

	public static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void selectsort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++)
				if (a[j] < a[i])
					min = j;
			swap(a, i, min);
		}
	}

	public static void insersort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j,s = a[i];
			for (j = i; j > 0 && s < a[j - 1]; j--) {
				a[j] = a[j - 1];
			}
			a[j] = s;
		}

	}

}
