package org.test.testmd5;

import com.wyx.utils.MD5;

public class TestMain {
	public static void main(String[] args) {
		String str;
		MD5 md5 = new MD5();
		str = md5.getMD5("123");
		System.out.println(str);
		
		String str2 = "www";
		str2 = "123" + str2;
		System.out.println(str2.substring(3,str2.length()));
	}
}
