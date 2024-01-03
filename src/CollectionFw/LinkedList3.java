package CollectionFw;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		
		System.out.println("Extra Methods as in Linkedlist class...!");
		
		LinkedList al=new LinkedList();
		
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		
		System.out.println(al);
		
		for(Object e:al)
		{
			System.out.println(e);
		}
		
		al.addFirst("Cashew - Kaju");
		
		al.addLast("Walnuts - Akhrot");
		
		System.out.println(al);
		
		System.out.println(al.getFirst()); 
		System.out.println(al.getLast()); 
		
		
		al.removeFirst();
		System.out.println(al);
		al.removeLast();
		System.out.println(al);
	}

}
