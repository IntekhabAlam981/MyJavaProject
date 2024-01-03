package CollectionFw;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();//Insertion order not preserved and Duplicates not allowed
								//Can't sort or shuffle elements directly because insertion order not preserved.
								// For Sorting First we have to convert HastSet into ArrayList
		
		hs.add("Z");
		hs.add("Y");
		hs.add("A");
		hs.add("B");
		hs.add("Z");
		hs.add(null);
		hs.add(true);
		hs.add(false);
		
		System.out.println(hs);
		
		hs.remove("B");
		System.out.println(hs);
		System.out.println(hs.contains(true));	
		
		System.out.println(hs.isEmpty());
		
    	System.out.println("Retrieving elements using iterator methods....!");	
    	
    	Iterator it=hs.iterator();
    	while(it.hasNext())
    	{
    		System.out.println(it.next());
    	}
    	
    	

	}

}
