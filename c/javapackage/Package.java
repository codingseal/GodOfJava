package c.javapackage;

//import c.javapackage.sub.Sub;
import static c.javapackage.sub.Sub.subClassStaticMethod;
import static c.javapackage.sub.Sub.CLASS_NAME;

public class Package {
	public final static String CLASS_NAME="Package";
	public static void main(String[] args) {
		// Sub sub = new Sub();
		// sub.subClassMethod();
		// System.out.println("Package class.");
		subClassStaticMethod();
		System.out.println(CLASS_NAME);
	}
}