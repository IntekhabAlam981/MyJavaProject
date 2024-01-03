package ApnaCollegePrac1;

import java.util.Scanner;

public class PrimeNoPrg1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int count=0;
		
		if(n>1)
			{
				for(int i=1;i<=n;i++)
				{
					if(n%i==0)
						count++;
				}
				if(count==2) {
					System.out.println("This is a Prime No");
				}
				else {
					System.out.println("This is not a Prime No");
				}
				
			}
			
		
		else {
			System.out.println("Not prime");
			}
		}

	}


