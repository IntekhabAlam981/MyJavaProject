package JavaPrograms;

public class Factorial_FibonacciNo 

{
public static void main(String args[])
{
	int n=5; //This variable is for both prgs.
	int f=1;
	for(int i=n;i>=1;i--)
	{
		 f=f*i;
		
	}
	System.out.println("Factorial of "+n+" is :"+f);
	
	System.out.println("===============================================");//Correct this statement..
	
	//Fibonacci series:-
	
	int a=1;int b=2;
	System.out.println("Fibonacci series of "+n+" numbers are as below:-");
	System.out.print(+a+" "+b);
	
	for(int i=3;i<=n;i++)
	{
    int c=a+b;
    System.out.print(" "+c);
	a=b;
	b=c;
	}

	
	
}


}
