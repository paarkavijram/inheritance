package org.com.test;

public class Desktop extends Computer{

	public void desktopSize()
	{
		float s=51.6f;
		System.out.println("Apple iMac: "+s+"cms");
		
		int e=51;
		System.out.println("Dell Optiplex: "+e+"cms");
		
		float f=50.6f;
		System.out.println("Lenovo ThinkCentre: "+f+"cms");
		
		float sd=51.9f;
		System.out.println("HP: "+sd+"cms");
		
		float sp=53.6f;
		System.out.println("Acer: "+sp+"cms");
		
	}
	public static void main(String[]args)
	
	{
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
	}
}
