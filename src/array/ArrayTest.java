package array;

public class ArrayTest {
	public static void main(String[] args) {
//	int [] a = new int [5];
//		
//		a[0] = 10;
//		a[1] = 21;
//		a[2] = 2;
//		a[3] = 60;
//		a[4] = 3;
//		a[5]=4;
//	
//		
//		
//		System.out.println(a[2]);
//	
//		
//		for(int i=0; i<5; i++)
//		{
//			System.out.println(a[i]);
//		}
		
//		int [] a = new int [5];
//		
//		a[0] = 10;
//		a[1] = 21;
//		a[2] = 2;
//		a[3] = 60;
//		a[4] = 60;
//
//	for(int t:a)
//	{
//		System.out.println(t);
//	}
//	
String [] str = new String [3];
		
		str[0] = "a1";
		str[1] = "a2";
		str[2] = "a3";//h =>a1,a2,a3   h=a2
		
		
		for(String h:str)
		{
			if(h.equals("a3"))
			{
				h= h+34;
				System.out.println(h);
			}
		}

}


	}

