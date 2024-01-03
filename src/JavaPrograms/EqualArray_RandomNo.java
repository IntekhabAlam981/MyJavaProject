package JavaPrograms;

import java.util.Arrays;
import java.util.Random;

public class EqualArray_RandomNo {

	public static void main(String[] args) {
		// Equal Arrays and Random No.Prg...!

		int a1[]= {1,2,3,4,4};
		int a2[]= {1,2,4,4};
		
		int l1=a1.length;
		int l2=a2.length;
		
		boolean status=true;
		
		if(l1==l2)
		{
			for(int i=0;i<l1;i++)
			{
				
					if(a1[i]==a2[i])
					{
						status=true;
						//System.out.println("Two Arrays are Equal.");
					}
					
				
			}
		}
		else
		{
			status=false;
		}
			
			if(status==true)
			{
				System.out.println("Two Arrays are Equal.");
			}
			else
			{
				System.out.println("Two Arrays are Not Equal.");
			}
			
			//==========================================================================================================================================
			System.out.println("==============================================================================");
			boolean st=Arrays.equals(a1,a2);
			
			if(st==true)
			{
				System.out.println("Equal Arrays..!");
			}
			else
			{
				System.out.println("Not Equal Arrays..!");
			}
			
			//==========================================================================================================================================
			System.out.println("==============================================================================");
			
			Random r=new Random();
			int rno=r.nextInt(1000);
			System.out.println(rno); 
			
		
			
			
			
			
			
			
		}
		
		
	}

