package edu.gac.mcs178.gack.domain;

import java.util.List;
import java.util.Random;

public class Wizard extends AutoPerson {
	
	private Place chamber;
	private Random random = new Random();
	
	public Wizard(String name, Place place, int threshold, Place chamber) {
		super(name, place, threshold);
		this.chamber = chamber;
	}
	
	@Override
	public void act() {
		List<Scroll> scrolls = Scroll.scrollsIn(getPlace());
		if ((!scrolls.isEmpty()) && (!getPlace().equals(chamber))) {
			int randomIndex = random.nextInt(scrolls.size());
			Scroll chosenScroll = scrolls.get(randomIndex);
			
			take(chosenScroll);
			moveTo(chamber);
			lose(chosenScroll);
		} else {
			super.act();
		}
	}
	
	public static void main(String[] args) {
		Place chamberOfWizards = new Place("Chamber of Wizards");
		Place karlsOffice = new Place("Karl's Office");
		new Wizard("Elvee", karlsOffice, 2, chamberOfWizards);
		
		karlsOffice.gain(new Scroll("Scroll of Enlightenment"));
		karlsOffice.gain(new Thing("Karl's phone"));
		
		System.out.println(karlsOffice.getContents());
		System.out.println(karlsOffice.getOccupants());
	}
}
