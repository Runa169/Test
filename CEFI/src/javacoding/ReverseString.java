package javacoding;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Like";
		String rstr = "";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			rstr = ch + rstr;
		}
		
		System.out.println("Reverse String =" +rstr);
	}

}



