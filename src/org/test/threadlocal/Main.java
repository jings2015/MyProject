package org.test.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	private static ThreadLocal<User> userLocal = new ThreadLocal<User>();

	public static void main(String[] args) {
		Main m = new Main();
		m.setMain();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread() {
			public void run() {
				Main m = new Main();
				m.setMain();
			};
		}.start();
	}

	public void setMain() {
		User user = new User();
		String timestamp = new SimpleDateFormat("HHmmss").format(new Date());
		user.setName("name" + timestamp);
		user.setPassword("password");
		userLocal.set(user);

		Test test = new Test();
		test.showUser();
	}

	public static User getuserLocal() {
		return userLocal.get();
	}

}

class Test {
	public void showUser() {
		User user = Main.getuserLocal();
		System.out.println(user.getName() + " " + user.getPassword());
	}
}
