package javaProgram;

import java.util.Stack;

public class StackSample {

	public static void main(String[] args) {
		Stack<Object> st=new Stack<Object>();//LAST IN FIRST OUT
		st.push(20);
		st.push(10);//LAST IN
		System.out.println(st.pop());//10 //FIRST
		System.out.println(st.pop());//20 //LAST
	}

}
