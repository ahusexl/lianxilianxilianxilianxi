
public class inoutclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       out o=new out();
    //   o.fun();
     //  System.out.println(o.outd);
	}

}

class out{
	private int outd=5;
	
	class in{
		private int ind=6;
		int in=outd;
		public void printd(){
			System.out.println(out.this.outd);
		}
	}
	
	
	public void fun(){
		in i=new in();
		i.printd();
		System.out.println(i.ind);
	}
}