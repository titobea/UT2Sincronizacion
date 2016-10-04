
public class DemoCoffeeStore {
	public static void main(String[] args) throws InterruptedException {
	    CoffeeStore store = new CoffeeStore();
	    Thread t1 = new Thread(new Client(store, "Mike"));
	    Thread t2 = new Thread(new Client(store, "John"));
	    Thread t3 = new Thread(new Client(store, "Anna"));
	    Thread t4 = new Thread(new Client(store, "Steve"));
	     
	    long startTime = System.currentTimeMillis();
	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	     
	    t1.join();
	    t2.join();
	    t3.join();
	    t4.join();
	     
	    long totalTime = System.currentTimeMillis() - startTime;
	    System.out.println("Sold coffee: " + store.countSoldCoffees());
	    System.out.println("Last client: " + store.getLastClient());
	    System.out.println("Total time: " + totalTime + " ms");
	}
}
