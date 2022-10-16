package javaProgram;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetSample {

	public static void main(String[] args) {
		SortedSet<String> set=new TreeSet<>();
		set.add("infosys");
		set.add("TCS");
		set.add("Apexon");
		set.add("CTS");
		set.add("Google");
		System.out.println(set);
		for(String str:set) {
			System.out.println(str);
		}
		System.out.println();
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("CTS"));//before it will print
		System.out.println(set.tailSet("CTS"));//after it will print

	}

}
