package org.test.simple;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		Random random = new Random();
		int i = random.nextInt(9999);
		String id = Integer.toHexString(i);
		System.out.println(id);
		System.out.println(i);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String str = sdf.format(date)+"|"+random.nextInt(9999);
		System.out.println(str);
		

	}

}
