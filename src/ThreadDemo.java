public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads th = new Threads();
		new Thread(th).start();
		new Thread(th).start();
		new Thread(th).start();
	}

}

class Threads implements Runnable {
	private int t = 5;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				if (this.t > 0) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("t= " + this.t--);
				}
			}
		}
	}
	

}