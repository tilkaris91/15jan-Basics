package AbstractAccessModifier;

public class test3 extends test2 {
public void m11() {
	System.out.println("final method");
}

public static void main(String[] args) {
	test3 b=new test3();
	b.method();
	b.m1();
	b.m11();
	b.m2();
	b.m3();
	b.m4();
}

@Override
public void m3() {
	// TODO Auto-generated method stub
	System.out.println("abstract method in test2");
}

@Override
public void m4() {
	// TODO Auto-generated method stub
	System.out.println("abstracted method in test2 and comes in test3 class");
}


}
