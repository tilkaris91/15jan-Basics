package methodsinjava;

public class Test3 {
	public void m10() {
		System.out.println("velocity");
	}
	public void m11() {
		System.out.println("vivo");
		StaticMethods f = new StaticMethods();
		f.m3();
	}

	public static void main(String[] args) {
	Test3 s = new Test3();
			s.m10();
			StaticMethods.m1();
		s.m11();
		
}
	
}
