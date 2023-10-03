package com.st.user;

public class Test {

	public static void main(String[] args) {
		//System.out.println("Hi..");
		MyFuncInter my = Test :: m1;
		String s = my.fun("Raj");
		System.out.println(s);
	}
	
	public static String m1(String s) {
		System.out.println("m1() "+s);
		return "Hi "+s;
	}

}

interface MyFuncInter {
	public String fun(String s);
}
