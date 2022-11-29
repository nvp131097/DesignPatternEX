package com.singlton;

public class StaticBlock {

	public static void main(String[] args) {
		
		App1 obj1 = App1.getInstance();
		App1 obj2 = App1.getInstance();
		
		
		if(obj1.equals(obj2))
			System.out.println("Both objects are same");
	}

}

class App1
{
private static  App1 eager;
	
	private App1()
	{
		System.out.println("Hello static Block");
	}
	//static block initialization for exception handling
	static {
		try {
			eager = new App1();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static App1 getInstance()
	{
		return eager;
	}
}