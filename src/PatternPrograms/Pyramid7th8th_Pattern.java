package PatternPrograms;

public class Pyramid7th8th_Pattern {

	public static void main(String[] args) 
	{
		System.out.println("7th Pyramid Pattern=====================================");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==========================");
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)//Logic-2
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("8th Pyramid Pattern=======================================");
		
		for(int m=1;m<=4;m++)
		{
			for(int n=1;n<=m;n++)
			{
				System.out.print(" ");
			}
			for(int p=4;p>=m;p--)
			{
				System.out.print("*");
				
			}
			for(int q=3;q>=m;q--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===================================");
		for(int m=1;m<=5;m++)
		{
			for(int n=1;n<=m;n++)
			{
				System.out.print(" ");
			}
			for(int p=11;p>(m*2);p--)//Logic-2
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
