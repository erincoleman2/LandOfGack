package edu.gac.mcs178.gack.domain;


import edu.gac.mcs178.gack.Utility;
import edu.gac.mcs178.gack.domain.Witch;

public class frogScroll extends MagicScroll {
	
	
	// Reading this scroll allows the user to turn someone else into a frog

	public frogScroll(String title) {
	
		super(title, 1); //can only be used once
		
	}

	@Override
	void doMagic() {
		
		// get the pond
		Place pond = this.getOwner().getPlace().getWorld().getSpecificLocation("Pond");
		
		// make a placeholder witch with no name (so we can use turnIntoFrog)
		Witch nobody = new Witch("No One", this.getOwner().getPlace(), 0,pond); 
		
		
		// tell the player they are a frog now
		Utility.displayMessage(this.getOwner().getName()+" read the "+this.getName()+" and turned into a frog!");

		
		// have the placeholder witch turn the person into a frog
		nobody.turnIntoFrog(this.getOwner());
		
		
		
	}

}
