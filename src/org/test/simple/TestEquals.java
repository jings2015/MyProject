package org.test.simple;

import java.util.ArrayList;
import java.util.List;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long l= 12141l;
		String str = Long.toString(l);
		System.out.println("str = " + str);
		if(l.equals("12141")){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		System.out.println(str.equals("12141"));
		
		Integer i = 0;
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.remove((int)i);
		for (String string : list) {
			System.out.println(string);
		}
		
		
	}

}
