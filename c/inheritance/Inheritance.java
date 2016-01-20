package c.inheritance;


public class Inheritance {
	public static void main(String[] args) {
		Parent parent=null;
		
		Child child = new Child();
		Parent parent2 = new Child();
		Parent.hello();
		parent.hello();
		System.out.println(child.num);
		child.hello();
		parent2.hello();
	}
	
	
	
	public static void objectCast2() {
		Parent[] parentArray = new Parent[3];
		parentArray[0] = new Child();
		parentArray[1] = new Parent();
		parentArray[2] = new Child();
		
		for (Parent tempParent : parentArray) {
			if (tempParent instanceof Child) {
				System.out.println("Child");
				Child tempChild = (Child)tempParent;
				tempChild.printAge();
			} else if (tempParent instanceof Parent) {
				System.out.println("Parent");
			}
		}
	}
	public static void callPrintName() {
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		Parent parent3 = new ChildOther();
		
		parent1.printName();
		parent2.printName();
		parent3.printName();
	}
}