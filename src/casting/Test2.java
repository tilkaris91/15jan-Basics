package casting;

public class Test2 extends Test {

	public void m1()
	{
		System.out.println("m1 method of child class" );
	}

	
	public static void main(String[] args) {
		Test2 b=new Test2();//child class
		
		Test n=(Test)b;//parent class
		
		Test2 m=(Test2)n;
		
		m.m1();
		n.m1();
		
	}
	


	
}