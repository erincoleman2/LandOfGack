
package edu.gac.mcs178.gack.domain;

import java.util.ArrayList;
import java.util.List;

public class IdentificationScroll extends MagicScroll {


	public IdentificationScroll(String title, Integer numUses) {
		super(title, 5000); // can be used pretty much as many times as the user wants

	}

	@Override
	void doMagic() {
		
		// reveal the true name of all mystery scrolls

		List<Thing> possessions = this.getOwner().getPossessions(); // get all the owner's possessions
		List<MagicScroll> mysteryScrolls = new ArrayList<MagicScroll>(); 
		for (Thing thing : possessions) { 
			
			// get all magic scrolls 
			
			if (thing instanceof MagicScroll& ((MagicScroll)thing).isMystery) {
				// if it is a magic scroll and a mystery
				mysteryScrolls.add((MagicScroll)thing);}
			}
		
		for (MagicScroll scroll : mysteryScrolls) {
			// reveal all of the mystery scrolls
			scroll.reveal();
			
		}
		
	}
		
		
	}


