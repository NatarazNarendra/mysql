package com.mkyong.jdbc;

@FunctionalInterface
interface sayable{
	//void say(String msg);	// abstract method
	// It can contain any number of Object class methods.
  //   void say1(String msg);
     public abstract void show(int i);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionalInterfaceExample2 implements sayable{
	 
	    public void say(String msg){ System.out.println(msg); }
        public void say1(String msg){
		System.out.println(msg);
	}
	public static void main(String[] args) {
		FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
		fie.say("Hello there");
        fie.say1("Hello there");
        	fie.say1("TEN");
	}
	@Override
	public void show(int i) {
		System.out.println(10);
		
	}
}
