public class replacespace {

	/**
	 * @param args
	 */
	
	public static void replaceallspace(char[] s) {
		
	//	if(s==null||s.length()<=0)return;
		
	//	int spacenum = getstringspacenum(s);
		
		int oldslength=15;
		
		int newslength=21;
		
		while (newslength >= 0) {
			if (s[oldslength] != ' ') {
				s[newslength] = s[oldslength];
				newslength--;
				oldslength--;
			} else {
				s[newslength] = '%';
				newslength--;
				s[newslength] = '0';
				newslength--;
				s[newslength] = '2';
				newslength--;
				oldslength--;
			}

		}
		

	}

	public static int getstringspacenum(String s) {
		int spacenum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ')
				spacenum++;
		}
		return spacenum;
	}
	
	public static void main(String[] args) {
		char[] ca=new char[50];
		String s = "we are young man      ";
		ca=s.toCharArray();
		replaceallspace(ca);
		System.out.println(new String(ca));

	}

	

}
