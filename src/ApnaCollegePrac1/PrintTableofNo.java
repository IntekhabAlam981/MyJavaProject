package ApnaCollegePrac1;

import java.util.Scanner;

public class PrintTableofNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter any no to print table= ");
		
		int n=sc.nextInt();
		
//		int t;
//		
//		System.out.println(n*1);
//		System.out.println(n*2);
//		System.out.println(n*3);
//		System.out.println(n*4);
//		System.out.println(n*5);
//		System.out.println(n*6);
//		System.out.println(n*7);
//		System.out.println(n*8);
//		System.out.println(n*9);
//		System.out.println(n*10);
//		
		for(int i=1;i<=10;i++)
		{
//			int tb=n*i;
//					System.out.println(tb);
			System.out.println(i*n);
		}
		
		
		
		
		
		
		
		
		
	}

}
