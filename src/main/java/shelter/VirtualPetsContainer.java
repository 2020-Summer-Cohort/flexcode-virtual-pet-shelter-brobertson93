package shelter;

import java.util.ArrayList;

public class VirtualPetsContainer {
	  private static VirtualPetsContainer single_instance = null;


	    public ArrayList<VirtualPet> array;
	    public ArrayList<String> arrayDead;
	    public boolean running = true; 

	    public boolean isRunning() {
			return running;
		}


		public void setRunning(boolean running) {
			this.running = running;
		}


		VirtualPetsContainer() {
	        array = new ArrayList<>(); //creates array list of pets that can be accessed globally
			arrayDead = new ArrayList<>();

	    }


	    public static VirtualPetsContainer getInstance() {
	        if (single_instance == null)
	            single_instance = new VirtualPetsContainer();

	        return single_instance;
	    }
}
