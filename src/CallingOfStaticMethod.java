
public class CallingOfStaticMethod {
	

	public static void m1()
	{
		System.out.println("m1 method");
		System.out.println("sanket");
	}
	
	public static void m8()
	{
		m1();// calling of static method inside another static method
		System.out.println("lahudon");
	}
	
	
	public void m3()
	{
		System.out.println("m3 non static method");
		m2();// calling of static method inside non static method
		
	}
	
	
	public void m4()
	{
		System.out.println("m4 method from calling of static method");
	}
	
	public static void main(String[] args) {
		CallingOfStaticMethod varname = new CallingOfStaticMethod();
		varname.m3();
		varname.m4();
		m2();
		CallingOfNonStaticMethod sanket = new CallingOfNonStaticMethod();
		sanket.m6();
}
	
}