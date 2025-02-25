package edu.gac.mcs178.gack;

import edu.gac.mcs178.gack.domain.AutoPerson;
import edu.gac.mcs178.gack.domain.Person;
import edu.gac.mcs178.gack.domain.Place;
import edu.gac.mcs178.gack.domain.Scroll;
import edu.gac.mcs178.gack.domain.TeleportationScroll;
import edu.gac.mcs178.gack.domain.EnlightenmentScroll;
import edu.gac.mcs178.gack.domain.Thing;
import edu.gac.mcs178.gack.domain.Witch;
import edu.gac.mcs178.gack.domain.Wizard;


public class GackWorld extends World {
	
	public GackWorld() {
		super();
		
		
		Place foodService = new Place("Food Service", this);
		Place po = new Place("Post Office", this);
		Place alumniHall = new Place("Alumni Hall", this);
		Place chamberOfWizards = new Place("Chamber of Wizards", this);
		Place library = new Place("Library", this);
		Place goodShipOlin = new Place("Good Ship Olin", this);
		Place lounge = new Place("Lounge", this);
		Place computerLab = new Place("Computer Lab", this);
		Place offices = new Place("Offices", this);
		Place dormitory = new Place("Dormitory", this);
		Place pond = new Place("Pond", this);
	
		
		foodService.addNewNeighbor("down", po);
		po.addNewNeighbor("south", alumniHall);
		alumniHall.addNewNeighbor("north", foodService);
		alumniHall.addNewNeighbor("east", chamberOfWizards);
		alumniHall.addNewNeighbor("west", library);
		chamberOfWizards.addNewNeighbor("west", alumniHall);
		chamberOfWizards.addNewNeighbor("south", dormitory);
		dormitory.addNewNeighbor("north", chamberOfWizards);
		dormitory.addNewNeighbor("west", goodShipOlin);
		library.addNewNeighbor("east", library);
		library.addNewNeighbor("south", goodShipOlin);
		goodShipOlin.addNewNeighbor("north", library);
		goodShipOlin.addNewNeighbor("east", dormitory);
		goodShipOlin.addNewNeighbor("up", lounge);
		lounge.addNewNeighbor("west", computerLab);
		lounge.addNewNeighbor("south", offices);
		computerLab.addNewNeighbor("east", lounge);
		offices.addNewNeighbor("north", lounge);
		

		new AutoPerson("Max", offices, 2);
		new AutoPerson("Karl", computerLab, 4);
		new Witch("Barbara", offices, 3, pond);
		new Wizard("Elvee", offices, 1, chamberOfWizards);
		
		
		lounge.gain(new Thing("Karl's glasses"));
		
		library.gain(new EnlightenmentScroll("Scroll of Enlightenment", 2));
		
		String[] someTitles = {"War and Peace", "Iliad", "Collected Works of Rilke"};
		for (String title : someTitles) {
			library.gain(new Scroll(title));
		}
		computerLab.gain(new Scroll("Unix Programmers Manual"));
		computerLab.gain(new Scroll("NeXT User's Reference"));
		
		dormitory.gain(new Scroll("Late Lab Report"));
		
		alumniHall.gain(new TeleportationScroll("Scroll of Teleportation", 2));

		
		setPlayer(new Person("player", dormitory));
	}
}
