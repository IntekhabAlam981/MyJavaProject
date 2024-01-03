package JavaPrograms;

public class CountNoOfDigits_SumOfDigits {

	public static void main(String[] args) 

//	{
//		int n=1234;
//		
//		int c=0;
//		
//		while(n>0)
//		{
//			n=n/10;
//			c++;
//		}
//		System.out.println("No of digits is:"+c);
//
//	}
	
	//=======================================================================================
	
	{
	int n=12345;
	
	int s=0;
	
	while(n>0)
	{
		int r=n%10;
		s=s+r;
		n=n/10;
	}
	
	System.out.println("Sun of digits is:"+s);
	
	}
}
