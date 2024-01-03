package JavaPrograms;

import java.util.Scanner;

public class OccOfCharName {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str2=sc.nextLine();
		//String str2="atif";
		int l2=str2.length();
		int count=0;
		
		for(int i=0;i<l2;i++)
		{
			count=0;//why??
			char ch=str2.charAt(i);
		
			for( int j=0;j<l2;j++)
			{
				char chh=str2.charAt(j);
				
				if(ch==chh)
				{
					count++;
				}
			}
			System.out.println("Count of "+ch+" is "+count);
		}
	}

}
