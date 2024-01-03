package CollectionFw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		//HashMap hm=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101,"X");
		hm.put(102,"Y");
		hm.put(103,"Z");
		hm.put(104,"P");
		hm.put(105,"Q");
		
		System.out.println(hm);//{101=Atif, 102=Asif, 103=Arif, 104=Aquib, 105=Altaf}
		
	System.out.println(hm.get(101));//Atif
	hm.remove(105);
	System.out.println(hm);//{101=Atif, 102=Asif, 103=Arif, 104=Aquib}
	
	System.out.println(hm.containsKey(104));//true
	
	System.out.println(hm.containsValue("Arifffff"));//false
	
	System.out.println(hm.isEmpty());	//false
	
	System.out.println(hm.size());	//4
	
   System.out.println(hm.keySet()); //[101, 102, 103, 104]
   
   System.out.println(hm.values()); //[Atif, Asif, Arif, Aquib]
   
   System.out.println(hm.entrySet());//[101=Atif, 102=Asif, 103=Arif, 104=Aquib]>>{--]
   
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
   
//   for(int i:hm.keySet())
//   {
//	  // System.out.println(hm.get(i));//it will give/print values of corresponding key
//	   System.out.println(i+"   "+hm.get(i));
//   }
   System.out.println("===================Entry Specific methods:-================================"); 
   //Entry Specific methods:-
   
   for(Entry<Integer, String> entry:hm.entrySet())
   {
	   System.out.println(entry.getKey()+"    "+entry.getValue());
   }
   
   System.out.println("===================================================");
   
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
