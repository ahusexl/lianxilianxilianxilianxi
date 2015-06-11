interface net{
	public void brower();
}

class real implements net{
	public void brower(){
		System.out.println("on net");
	}
}

class proxy implements net{
    private net n;
    public proxy(net n){
    	this.n=n;
    }
	public void brower(){
		System.out.println("check ip");
		this.n.brower();
	}
}
public class testproxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        net n=new proxy(new real());
        n.brower();
	}

}
