package JavaPrograms;

public class StringClass_AllMethods {

	public static void main(String[] args) 
	{
		String s=" Welcome ";
		String s1=" to String class in java";
		
	System.out.println(s.length());	//Space is also counted as one char
	System.out.println(s.concat(s1));	
	System.out.println(s1.concat(s));
	
	System.out.println(s.trim());//will remove space before and after the string not in between

	System.out.println(s.charAt(1));//Here At 0th place space is there

	System.out.println(s.contains("W"));//True or False
	
	System.out.println(s.equals(" Welcome "));//space will also be seen and case sensitive
	
	System.out.println(s.equalsIgnoreCase(" welcome "));
	
	System.out.println(s.replace('e', 'a'));
	
	System.out.println(s.replace('l', 'p'));
	
	String s2="Hi This is Atif..!";
	
	System.out.println(s2.replace("Atif", "Malik"));
	
	String s3="Java";
	System.out.println(s3.substring(0,3));//Starting index starts from 0 and ending index starts from 1
	
	String s4="WELCome";
	
	System.out.println(s4.toLowerCase());
	
	System.out.println(s4.toUpperCase());
	}

}
    