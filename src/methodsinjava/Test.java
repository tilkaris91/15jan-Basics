package methodsinjava;

public class Test {
	public static void m11()
	{
		System.out.println("m11 method from Test class");
	}
	public void mt() {
		System.out.println("mt from test class nonstatic double");
		double a = 2.22;
		double b = 3.33;
		double c = a+b;
		System.out.println(c);
	}
	public static void m12() {
		System.out.println("static to nonstatic m12 method from test class");
		
	}
	public static void m13() {
		System.out.println("static to static from test class");
	}
	
}
