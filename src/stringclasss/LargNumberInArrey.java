package stringclasss;

public class LargNumberInArrey {
 public static void main(String[] args) {
	 int [] a=new int [6];
		
		a[0]=200;
		a[1]=300;
		a[2]=02;
		a[3]=26;
		a[4]=20;
		a[5]=250;
		
		int size = a.length;
		int large=a[0];
		
		for(int i=0; i<size; i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
			
		}
		
		System.out.println("largest no is "+large);
}
}
