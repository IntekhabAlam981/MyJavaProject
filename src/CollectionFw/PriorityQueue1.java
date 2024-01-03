package CollectionFw;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) { //6 Mrthods in Priority Queue...! add(),offer(),element(),peek(),remove(),poll();
		
		PriorityQueue pq=new PriorityQueue();//Insertion order preserved and Allow Duplicates as well but not allowed Heterogeneous data
		
		pq.add("A");//if addition success then True else Exception
		pq.add("B");
		pq.add("C");
		pq.offer("C");//if addition success then True else False
		
		System.out.println(pq);
		
		//For Retrieving/Getting head Element.
		//System.out.println(pq.element());//if Queue is empty then gives Exception.	
	
		//System.out.println(pq.peek());//if Queue is empty then gives Null.
		
		
	//For Retrieving/Getting and removing head Element.
	System.out.println(pq.remove());//if Queue is empty then gives Exception.
	System.out.println(pq);
	
	System.out.println(pq.poll());	//if Queue is empty then gives Null
	System.out.println(pq);	
		
		

	}

}
