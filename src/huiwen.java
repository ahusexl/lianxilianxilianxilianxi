
public class huiwen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=68,b=3,sum=a;
		
		for(int i=0;i<b;i++)
			sum=sum+introta(sum);
		
		
		System.out.println(ishuiwen(sum));

	}
	
	private static boolean ishuiwen(int sum) {
         if(sum==introta(sum))
        	 return true;
		return false;
	}

	public static int introta(int a){
		int sum=0;
		while(a!=0)
		{
			sum=sum*10+a%10;
			a/=10;
		}
		return sum;
	}

}
