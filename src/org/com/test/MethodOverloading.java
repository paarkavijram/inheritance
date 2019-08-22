package org.com.test;

public class MethodOverloading {

	public void add()
	{
		System.out.println("adding");
	}
	public void add(int a)
	{
		System.out.println("A="+a);
	}
	
	public void add(int a,int b)
	{
		System.out.println("B="+b);
	}
	
	
	public static void main(String[] args)
	{
		MethodOverloading m=new MethodOverloading();
		m.add();
		m.add(2);
		m.add(3, 5);
	}
}


