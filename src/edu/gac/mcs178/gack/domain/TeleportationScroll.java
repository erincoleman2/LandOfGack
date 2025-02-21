package edu.gac.mcs178.gack.domain;

import java.util.ArrayList;
import java.util.List;

import edu.gac.mcs178.gack.Utility;

public class TeleportationScroll extends MagicScroll {

	public TeleportationScroll(String title, Integer numUses) {
		super(title, numUses);
		
	}

	@Override
	void doMagic() {
		// If player does not have scroll of enlightenment, they teleport to the library
		// If they do have the scroll, they teleport to the 
		
		
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
		
	// get list of locations
	ArrayList<Place> locations = this.getOwner().getPlace().getWorld().getLocations();
	
	// Find the requested location
	Place placeToGo = locations.get(0);
		for (Place place : locations) {
			if (place.getName()==nameOfPlaceToGo) {
				placeToGo = place; // set to the place we want the player to go
			}
		}
		
		// send the player to the location
		this.getOwner().moveTo(placeToGo);
	}
}
