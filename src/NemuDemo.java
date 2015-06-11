
public class NemuDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

enum Color{
	Red("ºìÉ«") {
		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	private String title;
	private Color(String s){
		this.title=s;
	}
	public abstract String getTitle();

	
}