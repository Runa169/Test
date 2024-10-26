package javacoding;

public class SwapTwoNumbers1 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println("x =" +x);
		System.out.println("y =" +y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("x =" +x);
		System.out.println("y =" +y);
	}

}
