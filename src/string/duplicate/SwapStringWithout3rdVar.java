package string.duplicate;

public class SwapStringWithout3rdVar {

	public static void main(String[] args) {
		String a = "Dipak";
		String b = "Patil";
		
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		System.out.println(b);
		a = a.substring(b.length(),  a.length());
		System.out.println(a);
		
		System.out.println( "a = "+ a + " b= " +b);
		
	}

}
