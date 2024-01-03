package JavaPrograms;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Bismillah.....!");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any no to check Prime or not: ");
		int n=sc.nextInt();
		int count=0;
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					count++;
			}	
				if(count==2)
				{
					System.out.println("its a Prime No.");
				}
				else
				{
					System.out.println("its not a Prime No.");
				}
			
		}
		else
		{
			System.out.println("Not a Prime No.");
		}

	}

}
