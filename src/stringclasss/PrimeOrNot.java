package stringclasss;

public class PrimeOrNot {

public static void main(String[] args) {
		
//prime and not prime
		int [] a=new int [6];
		
		a[0]=16;
		a[1]=17;
		a[2]=45;
		a[3]=19;
		a[4]=23;
		a[5]=89;
		
		boolean b =true;
		int i;
		int size = a.length;
		
		for(i=0; i<size; i++)
		{
			for(int j=2; j<a[i]; j++)
			{
				if(a[i]%j==0)
				{
					b=false;
					break;
				}
				
			}
			
			if(b==true)
			{
				System.out.println(a[i]+" is prime no");
			}
			else
			{
				System.out.println(a[i]+" is not prime");
			}
	
		
		}

		
	}
}

