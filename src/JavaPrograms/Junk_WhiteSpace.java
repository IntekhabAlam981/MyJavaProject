package JavaPrograms;

public class Junk_WhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="ASADatif@@##%%%&&**56789";
		
		String s=s1.replaceAll("[^a-zA-Z1-9]","");
		
		System.out.println(s);
		System.out.println("==============================================");
		
		String s2="ATIF      Ahamd  16@gmail.com";
		
		String ss=s2.replaceAll("\\s", "");
		
		System.out.println(ss);

	}

}
