package PatternPrograms;

public class NumericPattern2 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("==============================");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
			
//			for(int k=1;k<=3;k++)
//			{
//				for(int j=k;j>=1;j--)
//				{
//					System.out.print(j);
//				}
//				System.out.println();
//			}
		}

	}


