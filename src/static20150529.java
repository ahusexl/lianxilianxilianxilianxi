public class static20150529 {

	 //{
	//	System.out.println("gouzao");
	//	int i=3;
	//}
	static {
		int i=5;
		System.out.println(i);

	}

	static int i=6;
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println(i);
		abc c = new abc();

	}

}

class abc {
	{
		System.out.println("sgouzao");

	}

	static {
		System.out.println("sjingtai");

	}

	public abc() {
		System.out.println("sgouzaofntion");
	}
}