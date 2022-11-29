package com.singlton;

public class ThreadSafe {

	public static void main(String[] args) {
		
		App3 obj1 = App3.getInstance();
		App3 obj2 = App3.getInstance();
		
		if(obj1.equals(obj2))
			System.out.println("Both objects are same");

	}

}
class App3
{
	private static App3 thread;
	
	private App3()
	{
		System.out.println("Hello Thread safe singleton..");
	}
	public static synchronized App3 getInstance()
	{
		if(thread == null)
		{
			thread = new App3();
		}
		return thread;
	}
}