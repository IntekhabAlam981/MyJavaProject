package JavaPrograms;

//import java.io.BufferedReader;
import java.io.BufferedWriter;

//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Read_WriteData {

	
	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		
		/*
		 * FileReader fi=new FileReader("D:\\D Drive\\j p\\ReadData.txt");
		 * 
		 * BufferedReader br=new BufferedReader(fi);
		 * 
		 * String str;
		 * 
		 * while((str=br.readLine())!=null) { System.out.println(str); }
		 * 
		 * br.close();
		 */
		System.out.println("========================================");
		
		
		FileWriter fw=new FileWriter("D:\\D Drive\\j p\\WriteData2.txt");
		
		try (BufferedWriter bw = new BufferedWriter(fw)) 
		{
			bw.write("Hi baby....!");
			bw.write("\n\nLove you....Thanks baby.");
			bw.write("  Bye Bye");
		} 
		
			System.out.println("The End...!");
		
		
		
		

	}

}
