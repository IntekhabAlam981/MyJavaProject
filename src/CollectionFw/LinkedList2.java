package CollectionFw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {

		System.out.println("Same Methods as in Arraylist class...!");
		
		LinkedList al=new LinkedList();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println(al);//Before addAll method
		
		ArrayList al1=new ArrayList();
		al1.add("E");
		al1.add("Z");
		al1.add("Y");
		al1.addAll(al);
		
		System.out.println(al1);//After AddAll method
		
		al1.removeAll(al);
		System.out.println(al1);//After removeAll method
		
		Collections.sort(al1);
		System.out.println(al1);//After sorting
		
		al1.addAll(al);
		System.out.println(al1);//After AddAll method second time
		
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);////After sorting in reverse/descending order
		
		Collections.shuffle(al1);
		System.out.println(al1);//After shuffling

		Collections.sort(al1);
		System.out.println(al1);//After sorting
		
		

	}

}
