package projectA10;

interface MyInterface {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1() in MyInterface");
	}
	
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface2");
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2() in MyInterface2");
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2{
	public void method1() {
		System.out.println("method1() in child3");// 오버라이딩
	}
}

class Parent3{
	public void method2() {
		System.out.println("method2() in child3");
	}
}

public class ProjectA1011 {
	
	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2();
		MyInterface.staticMethod1();
		MyInterface2.staticMethod2();
	}

}
