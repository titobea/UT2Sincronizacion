
public class CoffeeStore {
	    private String lastClient;
	    private int soldCoffees;
	     
	    private void someLongRunningProcess() throws InterruptedException {
	        Thread.sleep(3000);
	    }
	     
	    public synchronized void buyCoffee(String client) throws InterruptedException {
	        someLongRunningProcess();
	        lastClient = client;
	        soldCoffees++;
	        System.out.println(client + " bought some coffee");
	    }
	     
	    public int countSoldCoffees() {return soldCoffees;}
	     
	    public String getLastClient() {return lastClient;}
}
