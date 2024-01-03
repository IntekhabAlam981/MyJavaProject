package Searching_SortingAlgo;

public class LinearSearch1 {

	public static void main(String[] args) 
	{
		int ar[]= {3,4,5,6,7,2};
		
		int item=12;
		int temp=0;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]==item)
			{
				System.out.println("item is present at index: "+i );
				temp=temp+1;
			}
		}
		if(temp==0) 
		{
			System.out.println("Item not found.");
		}
		
		

	}

}
