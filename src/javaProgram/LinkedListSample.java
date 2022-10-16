package javaProgram;


import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
	    LinkedList<Object> list=new  LinkedList<Object>();
		list.add(10);
		list.add("hi");
		list.add(null);
		list.add(10);
		list.add(20);
		list.addFirst("bye");
		list.addLast(30);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(1));
		System.out.println(list.removeFirst());
		System.out.println(list.remove(3));
		System.out.println(list.removeLast());
		
		LinkedList<Object> list2=new LinkedList<Object>();
		list2.add(30);
		list2.add("hi");
		list2.add(10);
		list2.add(0);
		list2.add(5);
		list.retainAll(list2);//show the duplicate present in last2 w.r.t list1
		System.out.println(list);
		list.removeAll(list2);//remove the duplicate present in list2 w.r.t list1
		System.out.println(list);
		list.addAll(list2);//add all the values to list
		for(Object ob:list)//fetch values present in list 1 by 1
		{ 
		System.out.println(ob);
		}
	}
}

