
public class judge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[]={30,45,13,634,234,333};
		int b[]={1,2,1,1,2,2};
        System.out.println(total(a,b,6));
	}

	private static int total(int[] a, int[] b, int p) {
		int sumzhuanjia=0,avazhuanjia=0,sumdazhong=0,avadazhong=0,total=0;
		for(int i=0;i<p;i++)
			if(b[i]==1)
				sumzhuanjia+=a[i];
			else if(b[i]==2)
		    	sumdazhong+=a[i];
				
		avazhuanjia=sumzhuanjia/p;
        avadazhong=sumdazhong/p;
        
		
		return (int) (avazhuanjia*0.6+avadazhong*0.4);
	}

}
