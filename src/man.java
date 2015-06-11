

public class man extends human implements eat {
	
	
	
	
	
	public static void main(String[] args) {
	
		man m=new man();
		m.speak();
		m.usetool();
		m.eat();
	}

	@Override
	public void speak() {
		System.out.println("speak");

	}

	/*@Override
	public void eat() {
		System.out.println("maneat");
		
	}*/

	/*public void usetool(){
		//System.out.println("manusetool");
	}*/
	

}



