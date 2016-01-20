public class ReferenceTypes {
	public ReferenceTypes() {

	}
	public ReferenceTypes(String data) {
	
	}
	
	public void print (int data) {
		
	}
	public void print (String data) {
		
	}
	public void print (int intData, String stringData) {
		
	}
	public void print (String stringData, int intData) {
		
	}
	
	public int intReturn () {
		int returnInt = 0;
		return returnInt;
	}
	public int[] intArrayReturn () {
		int a = 0;
		a++;
		int[] returnIntArray = {a, 2,};
		a++;
		return returnIntArray;
	}
	
	public void makeStaticBlockObject() {
		System.out.println("data="+StaticBlock.getData());
		/* System.out.println("Creating block1");
		StaticBlock block1 = new StaticBlock();
		System.out.println("Created block1");
		System.out.println("Creating block2");
		StaticBlock block2 = new StaticBlock();
		System.out.println("Created block2"); */
		System.out.println("data="+StaticBlock.getData());
	}
	
	public void callPassByvalue() {
		int a = 10;
		String b = "b";
		MemberDTO member = new MemberDTO("Sangmin");
		passByValue(a, b, member);
		System.out.println("CallPassByValue method result !!!");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("member.name=" + member.name);
	}
	
	public void passByValue(int a, String b, MemberDTO member) {
		a = 20;
		b = "z";
		//member = new MemberDTO("SungChoon");
		member.name = "SungChoon";
		System.out.println("passByValue method result !!!");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("member.name=" + member.name);
	}
	
	public void calculateNumbers(int... numbers) {
		int total = 0;
		for(int number:numbers) {
			total += number;
		}
		System.out.println("Total=" + total);
	}
	public static void main(String[] args) {
		ReferenceTypes referenece = new ReferenceTypes();
		referenece.callPassByvalue();
		referenece.calculateNumbers(1,2,3,4,5);
		referenece.calculateNumbers(1);
		referenece.calculateNumbers(1,2,3,4,5,6,7,8,9,10);
	}
}
