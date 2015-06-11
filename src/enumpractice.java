public class enumpractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		personl p=new personl("nina",Sex.Man);
		System.out.println(p);

	}

}

class personl {
	String name;
	Sex sex;
    
	personl(String name , Sex sex){
		this.name=name;
		this.sex=sex;
	}
	@Override
	public String toString() {
		return "person [toString()=" + this.name + " " + this.sex + "]";
	}

}

enum Sex {
	Man("ÄÐ"), Woman("Å®");
	private String title;

	Sex(String t) {
		this.title = t;
	}

	public String toString() {
		return title;
	}

}
