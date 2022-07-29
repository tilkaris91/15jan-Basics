package methodsinjava;

public class CategoiresOfMethods5 {
	// non writen with no argument
	public static void m1() {
		System.out.println("sanket");
	}
	// no return with arguments
	public static void m2(int a,int b) {
		System.out.println(a+b);
		
}
	public static void add(int i,int j) {
		int k = i + j;
		System.out.println(k);//
		System.out.println("execute m2");//execute
		m2(40,60);//100
	}
	
	//method with return with no argument
	public static int m3() {
		System.out.println("sanket");
		
		return 100;
		
	}
	// return with arguments
	public static long m4(long m,long n) {
		long k = m+n;
		return k;
	}
	public static int m6(String S1,int i) {
	S1 = S1+"city";
			System.out.println("value of s1 is "+S1);
	i = i+2;
	System.out.println("value of i is "+i);
	return i;
	}
	
	
	
	
	
	public static void main(String[] args) {
		m1();
		m2(90,100);
		add(11,12);
		long h = m4(30,40);
		System.out.println(h);
		int x = m6("pune",200);
		System.out.println(x);
	}

}
