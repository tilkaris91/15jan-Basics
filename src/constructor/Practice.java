package constructor;

public class Practice {
public Practice() {
	this(10);
	System.out.println("sanket");
}
public Practice(char a) {
	this ('c',20);
	System.out.println("tikari");
}
public Practice(char a,int b) {
	this();
	System.out.println("sudhakar");
}
public Practice(int c) {
	int v =12;
	int n = 13;
	int m = v+n;
	System.out.println(m);
}
public static void main(String[] args) {
	Practice n = new Practice('n');
}
}
