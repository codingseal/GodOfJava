package thread;

public class ThreadTest {
	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("Thread - 1");
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r1);
		
		t2.start();
	}
}