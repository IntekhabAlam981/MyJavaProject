package JavaPrograms;

public class ReverseNo_Palindrom_Armstrong {

	public static void main(String[] args) 
	{
		int n=121;
		
		int org=n;
		
		int rev=0;
		
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse no. is= "+rev);
		if(org==rev)
		{
			System.out.println("No.is Palindrom..!");
		}
		else
		{
			System.out.println("No.is not Palindrom..!");
		}
		
		//Armstrong Number
		
		int n1=153;//153,370,371,407
		int arm=0;
		int orgg=n1;
		
		while(n1!=0)
		{
			int r=n1%10;
			arm=arm+r*r*r;
			n1=n1/10; 
		}
		if(orgg==arm)
		{
			System.out.println("This No is Armstrong...!");
		}
		else
		{
			System.out.println("This No is not Armstrong...!");
		}
	}

}
