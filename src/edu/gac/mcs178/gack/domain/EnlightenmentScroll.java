package edu.gac.mcs178.gack.domain;

import edu.gac.mcs178.gack.Utility;

public class EnlightenmentScroll extends MagicScroll {



	public EnlightenmentScroll(String title, Integer numUses) {
		super(title, numUses);
	}

	@Override
	void doMagic() {
	
	
	
		
		// if the owner of the scroll is in the computer lab
		if (this.getOwner().getPlace().getName() == "Computer Lab") {
			// display a message saying you understand compsci
			Utility.displayMessage("Congratulations, you understand computer science now!");
		}
		else {
			// display a message saying to try somewhere else
			Utility.displayMessage("Maybe try this in another location...");
		}
		
	}

}
