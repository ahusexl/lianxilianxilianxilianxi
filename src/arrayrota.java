
public class arrayrota {
	
	public static void main(String arg[]){
		int[] a={1,2,3,4,5,6,7,8};
		
	//	rotaten(a,3);
	    baoli(a,2);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		
	}
	
	private static void baoli(int[] a, int j) {
		while(j--!=0){
			int s=a[0];
			for(int k=0;k<a.length-1;k++){
				a[k]=a[k+1];
			}
			a[a.length-1]=s;
		}   
		
	}

	public static void rotate(int[]a,int i,int j){
		while(i<j)
		{
			int t=a[i];
			a[i++]=a[j];
			a[j--]=t;
			
		}
	}
	
	public static void rotaten(int[]a,int num){
		
		rotate(a,0,num-1);
		rotate(a,num,a.length-1);
		rotate(a,0,a.length-1);
	}

}
