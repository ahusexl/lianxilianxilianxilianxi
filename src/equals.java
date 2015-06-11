
public class equals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=41;
		int b=41;
		String[] c={"aaa"};
		String[] d={"aaa"};
		String[] e=c;
		e[0]="ppp";
		args[0]="aaa";
		args[1]="sss";
		for(int i=0;i<args.length;i++)
		System.out.println(args[i]);

	}

}
