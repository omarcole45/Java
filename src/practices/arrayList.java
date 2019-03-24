package practices;

import java.util.ArrayList;

public class arrayList {
//what are the classes that extends List collection interface
	//- ArrayList, LinkedList, vector - Implementing List Interface - the can all accept duplicate values.
	
	//Diff between ArrayList and array, the array has fixed size
	// where as ArrayList can grow dynamically, you can access and insert any value
	//in any index
	public static void main(String[] args) {
		
		ArrayList<String> a= new ArrayList<String>(); //dynamic size array. its not fixed like the regulary array. You can in
		//increase by adding or removing with the ArrayList. 
		a.add("Omar");
		a.add("Omar"); // Can accept duplicate values.
		a.add("Jack");
		a.add(0, "Mike"); // I want to add an element to the array to an index
		//a.remove(1); //I want to remove element from index 1
		//a.remove("Mike"); //I want to remove Mike. I can remove the string with this arrayList as well.
		//a.removeAll(a); // I want to remove all elements out the arrayList
		System.out.println(a); //Print the array list
		
		System.out.println(a.get(2)); //I want to get and print the element thats in index 2.
		
		//testing - check to see if string is in that array or not. 
		
		
		System.out.println(a.contains("testing")); //I want to verify is this keyword in the arrayList or not.
		//it will return true of false if it exist because its a boolean.
		//This is more efficient to check with an arrayList rather than a reg array
		//looking for does it contains. Just simply use this method with the arrayList.
		
		a.indexOf("Omar");//I want to know what index is "Omar" stored in.
		a.isEmpty(); //I want to check is the arrayList is empty. will return true or false.
		System.out.println(a.size()); //Size of the arrayList
		
		
		
		

	}

}
