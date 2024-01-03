package ApnaCollegePrac1;

import java.util.Scanner;

public class EvenNoTillN {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

		
//		for(; ;) { //Infinite loop without break(CTRL+C )
//			System.out.println("Apna College");
//			//break;
//		}
		
		
	}
		
		

}
