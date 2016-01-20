package c.inheritance;


public class Parent {
	int num = 5;
	public Parent() {
		System.out.println("Parent Counstructor");
	}
	public Parent(String nmae) {
		System.out.println("Parent(String) Counstrucotr");
	}
	
	public void printName() {
		System.out.println("printName() - Parent");
	}
	
	static void hello() {
		System.out.println("Parent - hello");
	}
}