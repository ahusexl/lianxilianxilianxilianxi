
public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a=new int [50];
		int [] b=new int [] {2,3,4};
		int d=5;
	//	a=b;
		inc(b,d);
		for(int i=0;i<b.length;i++)
		System.out.print(b[i]+"¡¢");
		System.out.print(d);

	}
	
	public static void inc (int []c, int e){
		c[0]=7;
		e=3;
	}

}
