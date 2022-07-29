package methodsinjava;

public class Basics {
	//numeric in static
	public static void add() {
		int a = 10;
		int b = 20;
		int k = a+b;
		System.out.println(k);
		Test.m11();
	}
	// boolean in static
	public static void m1() {
		boolean a = false;
		boolean b = true;
		boolean c = b;
		System.out.println(c);
	}
	//static char
public static void m2() {
	
	char f = 'k';
	
	
	System.out.println(f);
}
//static double
public static void m3() {
	System.out.println("static double");
	double a = 3.33;
	double b = 5.55;
	double c = a+b;
	System.out.println(c);
	Test.m13();
	
}
//string value
public static void g() {
	String h = "shree";
	String i = "nath";
	String j = h+i;
	System.out.println(j);
	
}
//nonstatic numeric
public void ma1() {
	System.out.println("ma1 nonstatic");
	int a = 20;
	int b = 30;
	int c=a+b;
	System.out.println(c);
	Test y = new Test();
	y.m12();
}
//nonstatic char
public void ma2() {
	char c = 'a';
	System.out.println(c);
}
//nonstatic string
//?//
// nonstatic with double
public void ma3() {
	System.out.println("ma3 nonstatic double");
	double a = 2.22;
	double b = 3.33;
	double c = a+b;
	System.out.println(c);
}
public void m4() {
	Test x = new Test();
			x.mt();
}

	public static void main(String[] args) {
		
	
		System.out.println("sanket tilkari");
		//numeric value
		add();
		//boolean value
		m1();
		//char value
		m2();
		//string value
		g();

		//static double
		m3();
		
		//n0nstatic numeric
		Basics f = new Basics();
				f.ma1();
  	//nonstatic char with the help of same object
				f.ma2();
	//nonstatic string
				
				
	//nonstatic with double
			f.ma3();
	//non static to nonstatic call from test class 
			f.m4();
	
	}
}
