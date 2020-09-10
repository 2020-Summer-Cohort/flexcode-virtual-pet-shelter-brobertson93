package shelter;

public class TimeIncrementer extends Thread {
	 public void run() {

	        
	        VirtualPetsContainer p = VirtualPetsContainer.getInstance();
	        while (p.isRunning()) {

	        	
	            for (int i = 0; i < p.array.size(); i++) {
	                p.array.get(i).incrementAttributes();
	                if (p.array.get(i).petStatus() == false){
	                	p.array.remove(i);
	                	i = i -1;

					}
	           
	            }

	            //petStatus here?
	            try {

	                Thread.sleep(6000); //increments increase by 4 seconds each time the while loop is ran

	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	        }


	    }

}
