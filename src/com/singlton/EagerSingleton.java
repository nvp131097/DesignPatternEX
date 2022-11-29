package com.singlton;

public class EagerSingleton {
	
public static void main(String[] args) {
		
		App obj1 = App.getInstance();
		App obj2 = App.getInstance();
		
		
		if(obj1.equals(obj2))
			System.out.println("Both objects are same");
	}
	
}

class App
{
	
private static  App eager = new App();
	
	private App()
	{
		System.out.println("Hello Eager");
	}
	public static App getInstance()
	{
		return eager;
	}
}