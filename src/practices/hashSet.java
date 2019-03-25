package practices;

import java.util.HashSet;
import java.util.Iterator;



public class hashSet {

	public static void main(String[] args) {
		//HashSet treeset, LinkedHashSet implements Set interface.
		//does not accept duplicate values
		//There is no gurantee elements stored in sequential order....May store in random order
		
		HashSet <String> hs= new HashSet<String>();
		
		hs.add("Tony");
		hs.add("Larry");
		hs.add("John");
		hs.add("Mary");
		System.out.println(hs);
		//System.out.println(hs.remove("Tony"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		
		/**
		 * Traverse through the the HashSet
		 */
		Iterator <String> i=hs.iterator(); //I want to create an object for Iterator class
//		i.next();//I want to iterator through each index to find its value
//		i.next();
//		i.next();
		
		while(i.hasNext()) {//I want to use a while Loop instead of putting i.next() time after time.
			//i.hasnext checks to see if there an index that is next.
			System.out.println("this is it " + i.next());
		}
		
		

	}

}
