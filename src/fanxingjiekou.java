public class fanxingjiekou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message<String> msg = new MessageDemo<String>();
		System.out.println(msg.echo("helloworld"));
	}

}

interface Message<T> {
	public T echo(T msg);
}

class MessageDemo<T> implements Message<T> {
	public T echo(T msg) {
		return msg;
	}
}