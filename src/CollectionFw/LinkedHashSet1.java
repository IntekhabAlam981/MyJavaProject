package CollectionFw;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		//HashSet lhs=new HashSet();
		
		LinkedHashSet lhs=new LinkedHashSet();//Insertion order preserved here & Rest all methods will work same.
		
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);    
		lhs.add(500);
		
		//System.out.println("HashSet: "+lhs);//Insertion order not preserved>[400, 100, 500, 200, 300]

		System.out.println("LinkedHashSet: "+lhs);//Insertion order preserved here.>[100, 200, 300, 400, 500]
		
		//?Can we sort LinkedHashSet or not????
	}

}
