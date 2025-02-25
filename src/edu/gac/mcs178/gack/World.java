package edu.gac.mcs178.gack;

import edu.gac.mcs178.gack.domain.Person;
import edu.gac.mcs178.gack.domain.Place;

import java.util.ArrayList;


public class World {
	
	private Person player;
	private ArrayList<Place> locations = new ArrayList<Place>(); // variable to keep track of all locations available in World


	public Person getPlayer() {
		return player;
	}
	
	public ArrayList<Place> getLocations(){ // getter for locations
		return locations;
	}
	
	protected void setPlayer(Person player) { 
		this.player = player;
	}

	public World() {}

	public void addLocation(Place place) { // add location to this.locations
		this.locations.add(place);
		
	}
	
	public Place getSpecificLocation(String name) {
		
		// get list of locations
		ArrayList<Place> locations = this.getLocations();
		
		// Loop through locations to find the requested location
		Place placeToGo = locations.get(0); // start at beginning of list
			for (Place place : locations) {
				if (place.getName()==name) {
					placeToGo = place; // set to the place we want the player to go and break loop
					break;
				}
			}
		

		return placeToGo;
	}
}
