package edu.gac.mcs178.gack.domain;



import javax.swing.JOptionPane;

import edu.gac.mcs178.gack.Utility;

public class EnlightenmentScroll extends MagicScroll {



	public EnlightenmentScroll(String title, Integer numUses) {
		super(title, numUses);
	}

	@Override
	void doMagic() {
	
		
		// if the owner of the scroll is in the computer lab
		if (this.getOwner().getPlace().getName() == "Computer Lab") {
			// display a dialogue message saying you understand compsci
			// this counts as "winning" the game
			
			JOptionPane.showMessageDialog(null, 
	                "You understand computer science now! You win the game.", 
	                "CONGRATULATIONS!", 
	                JOptionPane.PLAIN_MESSAGE);
			

		}
		else {
			// display a message saying to try somewhere else
			Utility.displayMessage("Maybe try this in another location...");
		
		}
		
	}

}
