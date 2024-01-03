package JavaPrograms;

public class StaticMethod1 
{
	//public void m1()
	static public void m1()
	{
		System.out.println("A");
	}
	
	public static void main(String[] args) 
	{
//		StaticMethod1 obj=new StaticMethod1();
//		obj.m1();
		m1();
		Xyz.m2();
		
	}
}
class Xyz
{
static public void m2()
{
	System.out.println("B");
}
}


