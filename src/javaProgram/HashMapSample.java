package javaProgram;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapSample {

	public static void main(String[] args) {

      HashMap<Integer, String> hp=new HashMap<Integer, String>();
      hp.put(10, "hi");
      hp.put(20, "hello");
      hp.put(10, "bye");//duplicate key is not allowed
      hp.put(20, "hello");//duplicate values are allowed
      hp.put(null, "hi");//one null key allowed
      hp.put(40, null);//allowed
      hp.put(50, null);//allowed
      System.out.println(hp);
      System.out.println(hp.remove(20));
      System.out.println(hp.remove(20));
      System.out.println(hp.size());
      System.out.println(hp.containsKey(5));
      System.out.println(hp.replace(5,"super"));
      System.out.println(hp.remove(20));
      System.out.println(hp.get(10));
      System.out.println(hp);
      
      for(Entry<Integer, String> m:hp.entrySet())//usage of for each in map
      {
    	 System.out.println(m.getKey()+" "+m.getValue()); 
      }
      

	}

}
