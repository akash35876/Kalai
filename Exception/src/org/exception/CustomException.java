package org.exception;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("serial")
class Hello extends Exception 
{

	public Hello(String errormessage) 
	{

		super(errormessage);
	}

}

public class CustomException
{

	static ArrayList<String> names = new ArrayList<>(Arrays.asList("abc", "def", "ghi"));

	public static void getNames(String name) throws Hello 
	{
		if (names.contains(name)) 
		{
			throw new Hello(name + " = Name already exist");
		} else 
		{
			names.add(name);
			System.out.println(name + " = is added");
		}
	}

	public static void main(String[] args) 
	{
		try 
		{
			getNames("lkg");
			getNames("AK");
			getNames("abc");
		} catch (Hello e) 
		{
			System.out.println(e + "Exception occured");
		}
	}

}