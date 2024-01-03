package CollectionFw;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		
		hs.add(2);
		hs.add(4);
		hs.add(6);
		
		
		System.out.println(hs);
		
		HashSet hs1=new HashSet();
		hs1.add(8);
		hs1.add(10);
		
		hs1.addAll(hs);
		
		System.out.println(hs1);
		
		hs1.removeAll(hs);
		System.out.println(hs1);
	}

}
