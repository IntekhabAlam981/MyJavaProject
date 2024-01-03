package PatternPrograms;

public class TwoDiagonal_Pattern {

	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)//Logic-2
			{
				//System.out.print("*");
				if(k>1 && k<(i*2)-1)//Logic
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)//Logic-2
			{
				if(k>1 && k<(i*2)-1)
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
	}

}
}
