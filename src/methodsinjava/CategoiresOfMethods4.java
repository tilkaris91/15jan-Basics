package methodsinjava;

public class CategoiresOfMethods4 {
	public static void m1() {
		
		System.out.println("sanket");
		
	}
	public static void m2(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	
	}
	public static void add(int i,int j) {
		int k=i+j;
		System.out.println(k);
		System.out.println("now executing method m2");
		m2(30,40);
	}
	
	public static int m3() {
		System.out.println("method with return type and with argument");
		
		return 100;
	}
	public String m5()
	{
		String s1 = "corporate";
		
		System.out.println(s1);
		
		return "Velocity";
	}
	public static int m6(String s1, int i)
	{
		
		s1 = s1+"city";
		
		System.out.println("value of s1 is "+s1);
		
		i  = i+2;
		
		System.out.println("Value of i is "+i);
		
		
		
		return i;
		
		
	}
	public static int m7(int m,int n) {
		int o = m+n;
		return o;
				
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		m1();
		m2(10,20);
		add(20,30);
		int k = m3();
		System.out.println(k);
		int l= k+2;
		
		System.out.println(l);
		
		int z = m6("Pune", 50);
		System.out.println(z);
		int f = m7(3,5);
		System.out.println(f);
	}
	
}
