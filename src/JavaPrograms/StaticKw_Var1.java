package JavaPrograms;

public class StaticKw_Var1 
{

	int empid;
	String empname;
	//String empcomp;
	static String empcomp="HCL";
	//StaticKw_Var1(int empid,String empname,String empcomp)
	StaticKw_Var1(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
		//this.empcomp=empcomp;
	}
	
	public void display()
	{
		System.out.println(empid+" "+empname+" "+empcomp);
	}
	
	
	public static void main(String[] args) 
	{
//		StaticKw_Var1 obj1=new StaticKw_Var1(101,"Atif","HCL");
//		obj1.display();
		StaticKw_Var1 obj1=new StaticKw_Var1(101,"Atif");
		obj1.display();
		StaticKw_Var1 obj2=new StaticKw_Var1(102,"Abdullah Shafique");
		obj2.display();
		StaticKw_Var1 obj3=new StaticKw_Var1(103,"Iqbal Bazmi");
		obj3.display();
	}

}
