package org.test.testinstanceof;

public class TestMain {

	public static void main(String[] args) {
		ClassA b = new ClassB("a","b");
		if(b instanceof ClassC){
			System.out.println("b instanceof c");
		}else{
			System.out.println("b is not instanceof c");
			if(b instanceof ClassB){
				System.out.println("b instanceof b");
			}
		}

	}

}
