package JavaPrograms;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) 
	{
		//System.out.println("Hi");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any char to check vowel or consonant: ");
			char ch=sc.next().charAt(0);
			
			  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("Vowel");
			}
			  else
			  {
				  System.out.println("Consonant");
			  }
		System.out.println("===============================================================");
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter any  no to produce table: ");
		int n=sc1.nextInt();
		
		//int n=5;
		System.out.println("Table of "+n);
		for(int i=1;i<=10;i++)
		{
			int t=n*i;
			System.out.println(n+"*"+i+"="+t);
		}
		

	}

}
