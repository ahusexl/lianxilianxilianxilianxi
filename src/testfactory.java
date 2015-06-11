
interface eatfruit{
	public void eatfruitp();
}

class apple implements eatfruit{
	public void eatfruitp(){
		System.out.println("eat apple");
	}
}

class orange implements eatfruit{
	public void eatfruitp(){
		System.out.println("eat orange");
	}
}

class factory{
	public static eatfruit getInstance(String name){
		if("apple".equals(name))
		{
			return new apple();
		}
		else if("orange".equals(name))
		{
			return new orange();
		}
		return null;
	}
}
public class testfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		eatfruit e=factory.getInstance("apple");
		e.eatfruitp();

	}

}
