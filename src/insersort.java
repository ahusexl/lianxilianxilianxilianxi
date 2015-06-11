
public class insersort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={4,6,7,9,1,2,3,8,5};
		   insersort(a);
			for(int i=0;i<9;i++)
				System.out.println(a[i]);

	}



public static void insersort(int a[]){
    int j,k;
    for(int i=1;i<9;i++)
        {k=a[i];
	     for(j=i;j>0&&k<a[j-1];j--)
			 a[j]=a[j-1];
        a[j]=k;}

}
}