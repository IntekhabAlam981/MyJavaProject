package ApnaCollegePrac1;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius to get area= ");
		
		double radius=sc.nextInt();
		
		double area=Math.PI*radius*radius;
		
		
	System.out.println("Area of circle= "+area);
	}

}
