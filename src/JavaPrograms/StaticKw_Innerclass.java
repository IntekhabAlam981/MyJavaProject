package JavaPrograms;

public class StaticKw_Innerclass 
{

	static class B
	{
		void m1()
		{
			System.out.println("InnerClas StaticKw Use");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		StaticKw_Innerclass.B obj=new StaticKw_Innerclass.B();
		obj.m1();

	}

}

