package JavaPrograms;

public final class larg_prime {

	public static void main(String[] args) 
	{
		// Maximum and Minimum in an Array.
		int n[]= {0,9,7,2,3,4,33};
		
		int larg=n[0];
		
		int low=n[0];
		
		for(int i=1;i<n.length;i++)
		{
			if(n[i]>larg)
			{
			larg=n[i];
			}
		}
		System.out.println("Largest No.is="+larg);
		
		for(int j=1;j<n.length;j++)
		{
			if(n[j]<low)
			{
				low=n[j];
			}
		}
		System.out.println("Lowest No.is="+low);
		
		System.out.println("=================================================");
		//==================================================================================================
		
		int pn=0;
		
		int c=0;
		
		if(pn>0)
		{
			for(int i=1;i<=pn;i++)
			{
				if(pn%i==0)
					c++;
			}
				if(c==2)
				{
					System.out.println("This is a Prime No.");
				}
				else
				{
					System.out.println("This is Not a Prime No.");
				}
		}
		else
		{
			System.out.println("Not a Prime No....!");
		}
		
	}

}
