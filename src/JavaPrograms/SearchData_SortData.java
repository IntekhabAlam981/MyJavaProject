package JavaPrograms;

import java.util.Arrays;

public class SearchData_SortData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]= {"a","b","c"};
		
		String se="A";
		boolean flag=false;
		
		for(int i=0;i<str.length;i++)
		{
			if(se.equalsIgnoreCase(str[i]))
				flag=true;
		}
		if(flag==true)
		System.out.println("Searched element found and that is= "+se);
	
		else 
		{
			System.out.println("Searched element not found...!");
		}
				
		System.out.println("=======================================================");
		
		int ar[]= {2,4,3,5,6};
		
	System.out.println("Before sorting= "+Arrays.toString(ar));
		int l=ar.length;
		
		for(int i=0;i<l-1;i++)  //No.of pass....(no of elements-1)
		{
			for(int j=0;j<l-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
			int temp=ar[j];
			ar[j]=ar[j+1];
			ar[j+1]=temp;
				}
			}
		}	
		System.out.println("After sorting= "+Arrays.toString(ar));
	}

}
