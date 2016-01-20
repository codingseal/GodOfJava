package  c.exception;

public class ExceptionSample {
	public static void main(String[] args) {
		ExceptionSample sample = new ExceptionSample();
		// sample.arrayOutOfBounds();
		try {
			sample.throwException(13);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void arrayOutOfBounds() {
		int[] intArray = null;
		try {
			intArray = new int[]{1, 2, 3, 4, 5};	
			System.out.println(intArray[4]);
		} catch (Exception e) {
			System.out.println(intArray.length);
			System.out.println("Exception ocuured.");
		} finally {
			System.out.println("Here is finally");
		}
		System.out.println("This code should run.");	}
	public void multiCatch() {
		int[] intArray = new int[5];
		try {
			System.out.println(intArray[5]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException occured");
		} catch (Exception e) {
			 System.out.println(intArray.length);
		 }
	}
	public void throwable() {
		int[] intArray = new int[5];
		try {
			intArray = null;
			System.out.println(intArray[5]);
		} catch (Throwable t) {
			System.out.println(t.toString());
		}
	}
	public void throwException(int number) throws Exception {
		// try {
			if (number > 13) {
				throw new Exception("Number is over than 12");
			}
		// } catch (Exception e) {
			// e.printStackTrace();
		// }
	}
	public void throwException2(int number) throws Exception {
		try {
			if (number > 12) {
				throw new Exception("Number is over than 12");
			}
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
