package ApnaCollegePrac1;

import java.util.Scanner;

public class MarksOfStudentProb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input;
		
		do {
			int marks=sc.nextInt();
			if(marks>=90&&marks<=100)
			{
				System.out.println("This is good.");
			}
			else if(marks>=60&&marks<=89)
			{
				System.out.println("This is also good.");
			}
			else if(marks>=0&&marks<=59)
			{
				System.out.println("This is good as well.");
			}
			else
			{
				System.out.println("Invalid.");
			}
			
			
			System.out.println("Enter 1 to Continue and 0 to Exit");
			input=sc.nextInt();
			
		}while(input==1);
		

	}

}
