public class Multitionclass2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		multition2 m = multition2.getInstance("female");
		System.out.println(m.getsex());

	}

}

class multition2 {
	private String sex;
	private multition2(String sex) {
		this.sex=sex;
	}

	private static multition2 mul1 = new multition2("male");
	private static multition2 mul2 = new multition2("female");

	public static multition2 getInstance(String s) {
		switch (s) {
		case "male":
			return mul1;
		case "female":
			return mul2;
		default:
			return null;
		}
	}
   public String getsex(){
	   return sex;
   }

}