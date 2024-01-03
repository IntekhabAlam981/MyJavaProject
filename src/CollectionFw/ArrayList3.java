package CollectionFw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList3 {

	public static void main(String[] args) {
		
		String arr[]= {"A","B","E","C","D","Z","Y"};
		System.out.println("Before converting..!");
		for(String value:arr)
		{
			System.out.println(value);
		}
		
		System.out.println("After converting..!");
		ArrayList al=new ArrayList(Arrays.asList(arr));//Coverting Simple Array into ArrayList
		System.out.println(al);
		
		
		System.out.println("After sorting..!");
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("After sorting in reverse order..!");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		System.out.println("After shuffling..!");
		Collections.shuffle(al);
		System.out.println(al);
	}

}
