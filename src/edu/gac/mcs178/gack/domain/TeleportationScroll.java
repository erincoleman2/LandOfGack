package edu.gac.mcs178.gack.domain;

import java.util.ArrayList;
import java.util.List;

public class TeleportationScroll extends MagicScroll {

	public TeleportationScroll(String title, Integer numUses) {
		super(title, numUses);
		
	}

	@Override
	void doMagic() {
		

		// If player does not have scroll of enlightenment, they teleport to the library
		// If they do have the scroll, they teleport to the computer lab
		
		
		// get list of possessions
		List<Thing> possessions = this.getOwner().getPossessions();
	
		String nameOfPlaceToGo = "Library";
		
		for (Thing thing : possessions) {
			if (thing instanceof EnlightenmentScroll) {
				// if the player has the enlightenment scroll, go to lab
				nameOfPlaceToGo = "Computer Lab";
				break;
				}
		}
		
	// get place to send the owner
	Place placeToGo = this.getOwner().getPlace().getWorld().getSpecificLocation(nameOfPlaceToGo);
	

	// send the player to the location
	this.getOwner().moveTo(placeToGo);
	}

}
