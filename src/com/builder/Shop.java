package com.builder;

public class Shop {

	public static void main(String[] args) {
		
		//Phone p = new Phone("Android",2,"QualComm",5.5,3100); //we need to remember sequence
		
		//do not need to remember sequence and need not to specify all the properties
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
		System.out.println(p);

	}

}
