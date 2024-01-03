package JavaPrograms;

public class Test2111F2 {

	public static void main(String[] args) {
		
//=====================================================================================================

		
		  int n=898; int temp=n;
		  
		  int rn=0;//0,3,32,321
		  
		  while(n>0) { 
		  int r=n%10; //3 
		  rn=rn*10+r;//3, 
		  n=n/10;
		  
		  }
		  
		  System.out.println("Reversed num is "+rn);
		  
		  if(rn==temp) { System.out.println("It's a Palindrom No."); } else {
		  System.out.println("It's not a Palindrom No."); }
		 

		/*
		 * int n=9473; ////153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084,
		 * 548834, 1741725, 4210818, 9800817,
		 * 
		 * int temp=n; int s=0; while(n>0) { int r=n%10;//3,5,1 s=s+r*r*r*r;//27,152,153
		 * n=n/10; }
		 * 
		 * if(s==temp) { System.out.println("it's a Armstrong No.");//153, 370, 371,
		 * 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818,
		 * 9800817, } else { System.out.println("it's not a Armstrong No."); }
		 */

		int a = 6;
		int b = 5;

		
//		  int c=a+b; 
//		  a=c-a; 
//		  b=c-a;
		  
						//a=1 b=2
//		a=a+b;//3
//		b=a-b;//1
//		a=a-b;//2
		  				//a=3,b=4
//		a=a*b; //12
//		b=a/b;  //3
//		a=a/b;  //4
//
//		System.out.println(a);
//		System.out.println(b);
	}

}
