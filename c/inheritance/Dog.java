package c.inheritance;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	public void move() {
		System.out.println("Dog is gonna move " + name);
	}
}