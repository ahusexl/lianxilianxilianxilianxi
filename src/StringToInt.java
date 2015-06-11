
public class StringToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="123456";
        int i=sToInt(s);
        System.out.println(i);
	}

	public static int sToInt(String s){
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			sum=sum*10+(s.charAt(i)-'0');
		}
		return sum;
	}
	
}

