
public class kebiancanshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(add(/*new int[]{1,2,4}*/));
	}
	public static int add(int...is)
	{   int sum=0;
		for(int i=0;i<is.length;i++)
			sum+=is[i];
		return sum; 
		
	}

}
