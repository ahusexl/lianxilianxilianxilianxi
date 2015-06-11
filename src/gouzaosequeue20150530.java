public class gouzaosequeue20150530 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new demogo(3);
	}

}



class demogo {
	private static int x = 1;
	{
		x = 2;
		System.out.println(x + "fourth");
	}
	static {
		System.out.println(x + "first");
	}

	public demogo(int x) {
		this.x = x;
		System.out.println(x + "fiveth");
	}


}