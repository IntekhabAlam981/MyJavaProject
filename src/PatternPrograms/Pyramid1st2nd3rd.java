package PatternPrograms;

public class Pyramid1st2nd3rd {

	public static void main(String[] args) 
	{
		System.out.println("Pyramid....!");
		
		System.out.println("1st==============================");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2nd==============================");
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("1st and 2nd Combined.==============================");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
