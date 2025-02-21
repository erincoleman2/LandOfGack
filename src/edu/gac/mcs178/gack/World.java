package edu.gac.mcs178.gack;

import edu.gac.mcs178.gack.domain.Person;
import edu.gac.mcs178.gack.domain.Place;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
}
