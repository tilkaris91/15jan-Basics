package practice;

public class CategoriesOfMathod {
//method with no return type and no argument
	public static void m1() {         //m1();
		System.out.println("method with no return type and no argument");
	}
	public void m2() {     //objet creation =>variable.method name
		System.out.println("nonstatic method with no return type and no argument");
	}
//static method with return type and with no argument
	public static String m3() {  //string n=m3(); syso(n);
		System.out.println("static method with return type and with no argument");
		return "sanket";
	}
	//nonstatic method with return type and with no argument
	public int m4() {  //object creation=>int i=referance variable.method=>syso()
		System.out.println("nonstatic method with return type and with no argument");
		return 12;
	}
	//method with no return type and with argument
	public static void m5(int a,int b) {    //m5(20,30)
		System.out.println("method with no return type and with argument");
		
		int k=a-b;
		System.out.println(k);
	}
	public void m7(char e) { //boject creation=> variable name.method name('q')
		System.out.println("nonstatic method with no return type and with argument");
	}
	//method with return type with argument
	public static int m6(String m) {  //object creation=> int d=ref veriable of objet.method name("sanket");
		System.out.println("method with return type with argument");
		return 20;
	}
	public String m8(char j) {         //objet creation=> String r=ref variable.method name('d')=> syso("dsdksd")
		System.out.println("m8 with char j");
		return "lahu";
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//method with no return type and no argument
		m1();
		//nonstatic method with no return type and no argument
		CategoriesOfMathod t=new CategoriesOfMathod();
		t.m2();
		//static method with return type and with no argument
		String z=m3();
		System.out.println(z);
		int a=t.m4();
		System.out.println(a);
		//method with no return type and with argument
		m5(60,20);
		
		int q =m6("sanket");
		System.out.println(q);
		
		t.m7('l');
		
		String d=t.m8('s');
		System.out.println(d);
		
	}
	
	
	
	
}
