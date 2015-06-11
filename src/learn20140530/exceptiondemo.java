package learn20140530;

public class exceptiondemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
			System.out.println(div.div(10, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println("finally");
         
	}

}
class div {
	public static int div(int x,int y)throws Exception{
		 int i=x/y;
		 return i;
	}
}