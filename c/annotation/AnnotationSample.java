package c.annotation;

public class AnnotationSample {
	@SuppressWarnings("deprecation")
	public void useeprecated() {
		AnnotationChild child = new AnnotationChild();
		child.noMoreUse();
	}
}