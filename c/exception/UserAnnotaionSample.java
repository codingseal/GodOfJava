package c.annotation;

public class UserAnnotationSample {
	@UserAnnotation(number=0)
	public static void main(String[] args) {
		UserAnnotationSample sample = new UserAnnotationSample();
		sample.checkAnnotations(UserAnnotationSample.class);
	}
	
	@UserAnnotation(number=1)
	public void annotaionSample1() {
		
	}
	@UserAnnotation(number=2,text="second")
	public void annotaionSample2() {
		
	}
	@UserAnnotation(number=3, text="third")
	public void annotationSample3() {
		
	}
	public void checkAnnotations(Class useClass) {
		//class 클래스에 선언되어 있는 getDeclaredMethods() 메소드를 호출하면,
		//해당 클래스에 선언되어 있는 메소드들의 목록을 배열로 리턴한다
		Method[] methods = useClass.getDeclaredMethods();
		for (Method tempMethod : methods) {
			//Method 클래스에 선언되어 있는 getAnnotation()이라는 메소드를 호출하면,
			//해당 메소드에 선언되어 있는 매개 변수로 넘겨준 어노테이션이 있는지 확인하고,
			//있을 경우 그 어노테이션의 객체를 리턴해준다.
			UserAnnotation annotation = tempMethod.getAnnotation(UserAnnotation.class);
			if (annotaion != null) {
				//어노테이션에 선언된 메소드를 호출하면, 그 값을 리턴해준다.
				int number = annotaion.number();
				String text = annotaion.text();
				
				System.out.println(tempMethod.getName() + "() : number=" + number + " text" + text);
			} else {
				System.out.println(tempMethod.getName() + "() : annotation is null");
			}
		}
	}
}