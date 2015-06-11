
public class stringcopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="sssss";
		String snew = "aaaaaaaaaa";
		System.arraycopy(s, 0, snew, 0, s.length());
		s=snew;
		System.out.println(snew);

	}

}
