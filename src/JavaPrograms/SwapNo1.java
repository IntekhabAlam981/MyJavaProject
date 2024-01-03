package JavaPrograms;

public class SwapNo1 {

	public static void main(String[] args) 
	{
		int a=3;
		int b=4;
		
		//1.Without taking 3rd variable.
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		//2.Without taking 3rd variable.
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		//3.Single Statement
		b=a+b-(a=b);
		
		
		
		System.out.println("After swapping a= "+a);
		System.out.println("After swapping b= "+b);

	}

}
