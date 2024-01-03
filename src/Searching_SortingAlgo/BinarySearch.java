package Searching_SortingAlgo;

public class BinarySearch {

	public static void main(String[] args) {
	
		int ar[]= {1,2,3,4,5,6,7,8,9};
		
		int item=8;
		int li=0;
		int hi=ar.length-1;
		int mi=li+hi/2;
	
	while(li<=hi)
	{
		if(ar[mi]==item)
		{
			System.out.println("Element is present at index= "+mi);
			break;
		}
		else if(ar[mi]<item)
		{
			li=mi+1;
		}
		else
		{
			hi=mi-1;
		}
		mi=(li+hi)/2;
		
	}	
	if(li>hi)
	{
		System.out.println("Element not found.");
	}

	}

}
