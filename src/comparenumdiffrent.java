public class comparenumdiffrent {
	public static void main(String[] args) {
		int a[] = { 77, 21, 1, 3, 5 };
		int b[] = { 1, 3, 5 };
		int al = 5;
		int bl = 3;
		comparenumdiffrent c = new comparenumdiffrent();
		int num = c.array_compare(al, a, bl, b);
		System.out.println(String.valueOf(num));

	}

	int array_compare(int len1, int array1[], int len2, int array2[]) {
		int dnum=0;
		while(len1>=1&&len2>=1){
			if(array1[len1-1]!=array2[len2-1]){
				dnum++;
				len1--;
				len2--;
			}
		}
		return dnum;

	}
}
