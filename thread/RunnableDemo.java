package thread;

public class RunnableDemo  implements Runnable {
	private Thread t;
	private String threadName;
	int number;
	RunnableDemo(String name) {
		threadName = name;
		number = 0;
		System.out.println("Creating "+ threadName);
	}
	
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				number++;
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
		System.out.println("Number is " + number);
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
}