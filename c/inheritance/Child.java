package c.inheritance;


public class Child extends Parent {
	public Child() {
	}
	public Child(String name) {
	}
	public void printAge() {
		System.out.println("printAge() - 18 month");
	}
	public void printName() {
		System.out.println("printName() - Child");
	}
	
	static void hello() {
		System.out.println("Child - hello");
	}
}