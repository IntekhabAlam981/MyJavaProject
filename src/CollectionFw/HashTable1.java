package CollectionFw;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTable1 {

	public static void main(String[] args) {
	
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		
		hm.put(101,"A");
		hm.put(102,"B");
		hm.put(103,"C");
		hm.put(104,"X");
		hm.put(105,"Y");
		
		System.out.println(hm);//{105=Y, 104=X, 103=C, 102=B, 101=A}
		
	System.out.println(hm.get(101));//A
	hm.remove(105);
	System.out.println(hm);//{104=X, 103=C, 102=B, 101=A}
	
	System.out.println(hm.containsKey(104));//true
	
	System.out.println(hm.containsValue("Af"));//false
	
	System.out.println(hm.isEmpty());	//false
	
	System.out.println(hm.size());	//4
	
   System.out.println(hm.keySet()); //[104, 103, 102, 101]
   
   System.out.println(hm.values()); //[X, C, B, A]
   
   System.out.println(hm.entrySet());//[104=X, 103=C, 102=B, 101=A]>>{--]
   
   for(int i:hm.keySet())
   {
	  // System.out.println(hm.get(i));//it will give/print values of corresponding key
	   System.out.println(i);
   }
   System.out.println("===================================================");
   
   for(String i:hm.values())
   {
	  // System.out.println(hm.get(i));//it will give/print values of corresponding key
	   System.out.println(i);
   }
   
System.out.println("===================================================");
   
   for(int i:hm.keySet())
   {
	  // System.out.println(hm.get(i));//it will give/print values of corresponding key
	   System.out.println(i+"   "+hm.get(i));
   }
   System.out.println("===================Entry Specific methods:-================================"); 
   //Entry Specific methods:-
   
  for(Map.Entry entry:hm.entrySet())
  {
	System.out.println(entry.getKey()+"    "+entry.getValue());  
  }
  	
  System.out.println("==============Getting key and Values using iterator=====================================");
  
  //Getting key and Values using iterator
  
  Set s=hm.entrySet();
  
 Iterator itr=s.iterator();
 
 while(itr.hasNext())
 {
	 Map.Entry entry=(Entry) itr.next();
	 System.out.println(entry.getKey()+"     "+entry.getValue());
 }
  

	}

}
