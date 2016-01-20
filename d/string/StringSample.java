package d.string;
public class StringSample {
	public static void main(String[] args) {
		StringSample sample = new StringSample();
		// sample.constructors();
		// System.out.println(sample.nullCheck(null));
		// sample.compareCheck();
		// sample.equalCheck();
		// sample.addressCheck();
		// sample.trimCheck();
		// sample.replaceCheck();
		// sample.formatCheck();
		sample.stringBuilderCheck();
	}

	// public void constructors() {
	// 	try {
	// 		String str = "최고?�� ?����? 기본?��";
	// 		//?��?��?��?�� 기본 캐릭?�� ?��?����? ��??��
	// 		byte[] array1 = str.getBytes();
	// 		printByteArray(array1);
	// 		// ?��?��?��?�� 기본 캐릭?�� ?��?����? ��??��
	// 		String str1 = new String(array1);
	// 		System.out.println(str1);
	// 		byte[] array2 = str.getBytes();
	// 		printByteArray(array2);
	// 		String str2 = new String(array2, "UTF-8");
	// 		System.out.println(str2);
	// 		byte[] array3 = str.getBytes("UTF-16");
	// 		printByteArray(array3);
	// 		String str3= new String(array3, "UTF-16");
	// 		System.out.println(str3);
	// 	} catch (Exception ex) {
	// 		ex.printStackTrace();
	// 	}
	// }

	public void printByteArray(byte[] array) {
		for (byte data : array) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	public boolean nullCheck(String text) {
		int textLength = text.length();
		System.out.println(textLength);
		if (text == null) return true;
		else return false;
	}

	public void compareCheck() {
		String text = "";
		System.out.println("text.length()=" + text.length());
		System.out.println("text.isEmpty()=" + text.isEmpty());
	}

	public void equalCheck() {
		String text = "Check value";
		String text2 = new String("Check value");
		String text3 = "check value";
		if (text == text2) {
			System.out.println("text==text2 result is same.");
		} else {
			System.out.println("text==text2 result is different.");
		}
		if (text.equals("Check value")) {
			System.out.println("text.equals(text2) result is same.");
		}
		if (text.equalsIgnoreCase(text3)) {
			System.out.println("text.equalsIgnoreCase(text3) result is same.");
		}
	}

	public void compareToCheck() {
		String text = "a";
		String text2 = "b";
		String text3 = "c";
		System.out.println(text2.compareTo(text));
		System.out.println(text2.compareTo(text3));
		System.out.println(text.compareTo(text3));
	}

	public void addressCheck() {
		String[] addresses = new String[3];
		addresses = new String[]{
			"서울시 구로구 신도림동",
			"경기도 성남시 분당구 정자동",
			"서울시 구로구 개봉동"
		};
		int startCount = 0, endCount = 0;
		int containCount = 0;
		String startText = "서울시";
		String endText = "동";
		String containText = "구로";
		for (String address : addresses) {
			if (address.startsWith(startText)) {
				startCount++;
			}
			if (address.endsWith(endText)) {
				endCount++;
			}
			if (address.contains(containText)) {
				containCount++;
			}
		}
		System.out.println("Starts with " + startText + " count is " + startCount);
		System.out.println("Ends with " + endText + " count is " + endCount);
		System.out.println("Contains with " + containText + " count is " + containCount);
	}

	public void indexOfCheck() {
		String text = "Java technology is both a progranming language and a platform";
		System.out.println(text.indexOf('a'));
		System.out.println(text.indexOf("a "));
		System.out.println(text.indexOf('a', 20));
		System.out.println(text.indexOf("a ", 20));
		System.out.println(text.indexOf('z'));
	}

	public void trimCheck() {
		String strings[] = new String[] {
			" a", " b ", "    c", "d    ", "e  f", "  "
		};
		for (String string : strings) {
			System.out.println("[" + string + "] ");
			System.out.println("Trim[" + string.trim() + "] ");
		}
	}

	public void replaceCheck() {
		String text = "The String class represents character strings.";
		System.out.println(text.replace('s', 'z'));
		System.out.println(text);
		System.out.println(text.replace("tring", "trike"));
		System.out.println(text.replaceAll(" ", "|"));
		System.out.println(text.replaceFirst(" ", "|"));
	}
	public void formatCheck() {
		String text = "제 이름은 %s입니다. 지금까지 %d권의 책을 썼고, "
			+ "하루에 %f%%의 시간을 책을 쓰는데 할애하고 있습니다.";
		String realText = String.format(text, "이상민", 4, 10.5);
		System.out.println(realText);
	}
	public void stringBuilderCheck() {
		StringBuilder sb = new StringBuilder("Lee ");
		sb.append("Hello").append(" world");
		int a = 2;
		sb.append(a);
		a = 3;
		System.out.println(sb);
	}
}
