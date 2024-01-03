package CollectionFw;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) 
	{
		
		HashSet<Integer> set1=new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		
		System.out.println("Hashset1: "+set1);
		
		HashSet <Integer>set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Hashset2: "+set2);
		
		//Union operatio>>Removes duplicates and give only unique element of both sets.
		set1.addAll(set2);
		System.out.println("Union: "+set1);//[1,2,3,4,5]
		
		//intersection>>Common elements in both sets
		//set1.retainAll(set2);
		//System.out.println("Intersection: "+set1);//[3,4,5]
		
		
		//Difference of Set1-Set2
		set1.removeAll(set2);
		System.out.println("Difference: "+set1);//[1, 2]
		
		//Subset>>Checks whether all elements of set2 present in set1 or not>>True/False
		System.out.println("Subset: "+set1.containsAll(set2));//true

	}

}
