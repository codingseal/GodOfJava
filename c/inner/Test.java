package c.inner;

public class Test {
	public static void main(String[] args) {
		OuterOfInner outer = new OuterOfInner();
		OuterOfInner.Inner inner = outer.new Inner();
		inner.setValue(10);
		
	}
}