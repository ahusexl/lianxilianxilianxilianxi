package suibina;

public class jiecheng {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(jiecheng(4));

	}

	private static int jiecheng(int i) {
		int sum=0;
		int jdata=1;
		for(int j=1;j<=i;j++)
		{
			jdata*=j;
			sum+=jdata;
		}
		return sum;
	}

}
