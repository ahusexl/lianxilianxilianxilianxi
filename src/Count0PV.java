import java.util.Scanner;

/*public class Count0PV {
 static int p = 0;
 static int n = 0;
 static int zero = 0;

 public static void main(String[] args) {

 int[] a = input();
 sort(a);
 output(a);
 System.out.println("正数个数为：" + p + "\n负数个数为：" + n + "\n0个数为：" + zero);
 }

 public static int[] input() {
 int[] a = new int[10];
 for (int i = 0; i < 10; i++) {
 System.out.println("输入第" + (i + 1) + "个数");
 Scanner s = new Scanner(System.in);
 a[i] = s.nextInt();
 if (a[i] > 0)
 p++;
 else if (a[i] < 0)
 n++;
 else
 zero++;
 }
 return a;
 }

 public static void sort(int[] a) {
 for (int i = 0; i < a.length - 1; i++)
 for (int j = a.length - 1; j > i; j--) {
 if (a[j] > a[j - 1]) {
 int t = a[j];
 a[j] = a[j - 1];
 a[j - 1] = t;
 }
 }
 }

 public static void output(int[] a) {
 for (int i = 0; i < a.length; i++)
 System.out.print(a[i] + " ");
 System.out.println("\n");
 }
 }*/
public class Count0PV {

	public static void main(String[] args) {
		int p = 0;
		int n = 0;
		int zero = 0;
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("输入第" + (i + 1) + "个数");
			Scanner s = new Scanner(System.in);
			a[i] = s.nextInt();
			if (a[i] > 0)
				p++;
			else if (a[i] < 0)
				n++;
			else
				zero++;
		}
		sort(a);
		output(a);
		System.out.println("正数个数为：" + p + "\n负数个数为：" + n + "\n0个数为：" + zero);
	}

	public static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++)
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] > a[j - 1]) {
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
	}

	public static void output(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("\n");
	}
}
