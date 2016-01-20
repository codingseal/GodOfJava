package c.inheritanc	e;

public class InheritanceObject {
	
	public static void main(String[] args) {
		InheritanceObject obj = new InheritanceObject();
		obj.toStringMethod(obj);
	}
	public void toStringMethod(InheritanceObject obj) {
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println("plus" + obj);
	}
}

