package PatternPrograms;

public class Pyramid4th5th6th {

	public static void main(String[] args) 
	{	
		System.out.println("Pyramid...!");
		
		System.out.println("4th=====================================");
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
			System.out.println();
		
		}
		
		System.out.println("5th=====================================");
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		
		}
		
		System.out.println("4th and 5th combined.=====================================");
		for(int i=1;i<=4;i++)
		{
			
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		
		for(int i=1;i<=3;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		
		}

	}

}
