package stringclasss;

public class DuplicatNumbersInArrey {
public static void main(String[] args) {
		

		int [] a=new int [6];
		
		a[0]=16;
		a[1]=45;
		a[2]=45;
		a[3]=26;
		a[4]=16;
		a[5]=89;
		
		int size = a.length;
	
		System.out.println("duplicate no are:");
		for(int i=0;i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}	
		
		}
		
		
	}
}
