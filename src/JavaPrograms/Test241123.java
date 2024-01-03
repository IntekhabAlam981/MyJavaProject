package JavaPrograms;

public class Test241123 {

	public static void main(String[] args) 
	{
		String s="Madam";
		
		String rs="";
		
		int l=s.length();//8
		
		String temp=s;
		
		for(int i=l-1;i>=0;i--)
		{
			rs=rs+s.charAt(i);
			
		}
		System.out.println(rs);
		
		if(rs.equalsIgnoreCase(temp))
		{
			System.out.println("Palindrom String");
		}
		else
		{
			System.out.println("Not Palindrom String");
		}
		
//		System.out.println("========Vowel and Consonant=========================");
//		
//		String s1="atif";
//		
//		for(int i=0;i<s1.length();i++)
//		{
//		char c=	s1.charAt(i);
//		if(c=='a'||c=='i'||c=='o'||c=='u'||c=='e')
//		{
//			System.out.println("Charcter "+c+" is a Vowel");
//		}
//		else
//		{
//			System.out.println("Charcter "+c+" is not a Vowel");
//		}
//			
//		}
		
		System.out.println("========No of Occurance of a char in a String=========================");
		
		String s2="MADAM";
		char c1=' ';
		char c2=' ';
		for(int i=0;i<s2.length();i++)
		{
			 c1=s2.charAt(i);
			for(int j=i+1;j<s2.length();j++)
			{
			 c2=s2.charAt(j);
				
			}
			if(c1==c2)
			{
			System.out.println("charcter "+c1+" is equal to "+c2);	
			}
			else
			{
				System.out.println("charcter "+c1+" is not equal to "+c2);
			}
			
			
			
		}
		
	}

}
