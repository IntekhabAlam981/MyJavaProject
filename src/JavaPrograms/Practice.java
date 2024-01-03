package JavaPrograms;

public class Practice {

	public static void main(String[] args) ////>>>>>>Fibonacci Series.
	{
		int f1=1;
		int f2=2;
		int f3=0;
		
		System.out.print(f1+" "+f2);
		
		for(int n=3;n<=10;n++)
		{
			 f3=f1+f2;//3
			 f1=f2;//2
			 f2=f3;//3
			 
			 System.out.print(" "+f3);
		}
		//===========================================================================================
		
		
		int fact=1;
		
		for(int i=4;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println("\nFactoril of 4= "+fact);
		
		//==============================================================================================================
		
		int n[]= {2,3,4};
		
		int len=n.length;
		
		int larg=n[0];
		
		int low=n[0];
		
		//for(int i=0;i<len;i++)
		
			if(larg>n[1]&&larg>n[2])
			{
				System.out.println("largest no is="+larg);
			}
		
		
		
		
	}
	

}
