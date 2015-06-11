
public class inheri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//abcd b=new abcd();
     //     b.abc();
    //      b d=new b();
   //       d.abc();
	}
	
	


/*
	
}*/

}
 abstract class abcd{
	int main=4;
	abcd(){
	//	System.out.println("ab");
	}
	
	public void abc(){
		System.out.println("abcdbabc");

	}
	
	public abstract void get();
}
abstract class b extends abcd{
  //  int main=5;
	b() {
		
	}
	
	public void abc(){
	//	super.abc();
	//	System.out.println("babc");
	System.out.println(main);
	}
}