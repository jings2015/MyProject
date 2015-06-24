package org.test.getmethod;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		User u = new UserImpl();
		Method m = u.getClass().getMethod("showUserName", u.getClass().getInterfaces()[0]);
		m.invoke(u, u);
		Method m2 = u.getClass().getMethod("showUserName", int.class);
		m2.invoke(u, 1);
		/*Êä³ö£º
		 * 123
		 * 1
		 */
	}

}

interface User{
	public void showUserName(User u);
}

class UserImpl implements User {
	private String userName = "123";
	
	public void showUserName(User u){
		System.out.println(userName);
	}
	
	public void showUserName(int i){
		System.out.println(i);
	}
	
}
