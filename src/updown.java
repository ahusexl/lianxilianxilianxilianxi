
public class updown {

	/**
	 * @param args
	 */

	
	public static class father{
		public String name1="father";
		
		public void printfname(){
			System.out.println(name1);
		}
		
		public void printffathername(){
			System.out.println(name1);
		}
	}
	
	public static class son extends father{
		public String name="son";
		
		public void printfname(){
			System.out.println(name);
		}
		
		public void printfsonname(){
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		father f= new son();
		f.printfname();
		f.printffathername();
     //   System.out.println(f.printfname());
	}
}
