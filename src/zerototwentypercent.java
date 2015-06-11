
public class zerototwentypercent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="I Love You I hate You";
		System.out.println(zerototwenty(s));

	}
 public static String zerototwenty(String s){
	 int spacenum=0;
	 for(int i=0;i<s.length();i++)
		 if(s.charAt(i)==' ')
	        spacenum++;
	 
	 System.out.println(spacenum);
	 
	return s;
	 
 }
}
