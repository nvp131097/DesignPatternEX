package com.singlton;

public class LazySingleton {

	public static void main(String[] args) {
		
		App2 obj1 = App2.getInstance();
		App2 obj2 = App2.getInstance();
		
		
		if(obj1.equals(obj2))
			System.out.println("Both objects are same");

	}

}

class App2
{
	private static App2 lazy;
	
	private App2()
	{
		System.out.println("Hello Lazy singleton");
	}
	
	public static App2 getInstance()
	{
		if(lazy == null)
			lazy = new App2();
		return lazy;
	}
}