
public class DemoVolatile {
	public static void main(String[] args) throws InterruptedException {
		TestVolatileThread t = new TestVolatileThread();
	    t.start();
	    Thread.sleep(1000);
	    t.keepRunning = false;
	    System.out.println("keepRunning set to false.");
	}
}
