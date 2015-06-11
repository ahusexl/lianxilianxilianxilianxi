public class gouzao20150530 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		demogouzao g =new demogouzao(5);
	g.print();
	}

}

abstract class gouzao {
	{
		System.out.println("父构造块");
	}
	static {
		System.out.println("父静态块");
	}
	

	public gouzao() {
		
		System.out.println("second"+"父构造方法");
		this.print();
	}

	public abstract void print();
}

class demogouzao extends gouzao {
	private  int x=100 ;
	{	
		System.out.println(x+"子构造块");
	}
	static {
		System.out.println(/*x +*/ "first"+"子静态块");
	}

	public demogouzao(int x) {
		this.x = x;
		System.out.println(x + "fiveth"+"子构造方法");
	}

	@Override
	public void print() {
		System.out.println(x + "third");
	}

}