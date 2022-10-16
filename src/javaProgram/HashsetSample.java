package javaProgram;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetSample {

	public static void main(String[] args) {
		HashSet<Object> set=new HashSet<Object>();
		set.add(10);
		set.add("hi");
		set.add(30);
		set.add("hello");
		set.add("hello");
		set.add(null);
		set.add(10);
		set.add(null);
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.remove(30));
		System.out.println(set.size());
		if(set.contains("hi")) {
			System.out.println("present");
			
		}
		else {
			System.out.println("not present");
		}
		for(Object obj:set) 
		{
			System.out.println(obj);
		}
		System.out.println();
		
		Iterator<Object> i=set.iterator();//iterator fetching data
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
