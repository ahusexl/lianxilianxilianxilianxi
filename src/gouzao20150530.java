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
		System.out.println("�������");
	}
	static {
		System.out.println("����̬��");
	}
	

	public gouzao() {
		
		System.out.println("second"+"�����췽��");
		this.print();
	}

	public abstract void print();
}

class demogouzao extends gouzao {
	private  int x=100 ;
	{	
		System.out.println(x+"�ӹ����");
	}
	static {
		System.out.println(/*x +*/ "first"+"�Ӿ�̬��");
	}

	public demogouzao(int x) {
		this.x = x;
		System.out.println(x + "fiveth"+"�ӹ��췽��");
	}

	@Override
	public void print() {
		System.out.println(x + "third");
	}

}