package JavaPrograms;

public class Even_OddAndSmall_largest {

	public static void main(String[] args) {
		int n=4563341;
		int ce=0;
		int co=0;
		while(n>0)
		{
		int	r=n%10;      //finding last digit or remainder here
			if(r%2==0)
				ce++;
			else if(r%2!=0)
			   co++;
			n=n/10;
		}
			System.out.println("Count of Even No= "+ce);
			System.out.println("Count of odd No=  "+co);
		
		System.out.println("===========================================================================");
			
		int a=15;
		
		int b=10;
		
		int c=7;
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);//Ternary operator or we acn also do by logic if a>b&&a>c the a is largest else if....s
		
		
		System.out.println("Largest no. is= "+largest);
		
		
		
		
	}

}
