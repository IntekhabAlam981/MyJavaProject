package CollectionFw;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		System.out.println("Same Methods as  in Arraylist class...!");
		
		LinkedList al=new LinkedList();
		
		al.add(1);
		al.add(null);
		al.add("A");
		al.add("A");
		al.add(0.75);
		al.add(2);
		al.add(null);
		al.add("z");
		al.add(true);
		
		System.out.println(al);//[1, null, A, A, 0.75, 2, null, z, true]
		
		System.out.println(al.size());//Size is 9
		
		
		al.remove("A");
		System.out.println(al);
		
		al.add(2,"P");
		System.out.println(al);
		
		System.out.println(al.get(4));//Retrieving Element
		
		al.set(4,0.85);
		System.out.println(al);//Changing/replacing Element
		
		System.out.println(al.contains("P")); //Checking single/searching single element
		
		System.out.println(al.containsAll(al)); //Checking all/searching all element
		
		System.out.println(al.isEmpty()); //Checking whether List is empty or not
		
		System.out.println("Retrieving element using for loop");
		
		for(int i=0;i<al.size();i++) //Retrieving element using for loop.
		{
		System.out.println(al.get(i));	
		}
		System.out.println("Retrieving element using for-each loop");
		for(Object e:al)
		{
			System.out.println(e);
		}
		
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
	}

}
