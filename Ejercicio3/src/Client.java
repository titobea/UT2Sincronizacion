
public class Client implements Runnable {
	    private final String name;
	    private final CoffeeStore store;
	     
	    public Client(CoffeeStore store, String name) {
	        this.store = store;
	        this.name = name;
	    }
	     
	    @Override
	    public void run() {
	        try {
	            store.buyCoffee(name);
	        } catch (InterruptedException e) {
	            System.out.println("interrupted sale");
	        }
	    }
}
