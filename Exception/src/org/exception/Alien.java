package org.exception;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("serial")
class Akash extends Exception{
	
	public Akash(String errormessage) {
		super(errormessage);
	}
	
}

public class Alien {
	
	static ArrayList<String> names = new ArrayList<>(Arrays.asList("a","b","c"));
	
	public static void getNames(String name)throws Akash {
		
		if(names.contains(name)) {
			throw new Akash(name +"  already exist");
		}else {
			names.add(name);
			System.out.println(name+"  is added");
		}
	} 
	
	public static void main(String[] args) {
		try {
			getNames("d");
			getNames("e");
			getNames("c");
		}catch(Akash e){
			System.out.println(e +"  Exception occured");
		}
	}

}
