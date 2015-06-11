
public class fanxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*point<String> p=new point<String>();
		p.setX("20");
		p.setY("sss");
		System.out.println(p.getX());*/
		/*point p=new point();*/
		point<String> p=new point</*String*/>();
		p.setX("20");
		p.setY("sss");
		String x=p.getX();
		System.out.println(x);

	}

	
}
class point<T>{
	T x;
	T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
}