package edu.gac.mcs178.gack.domain;

import edu.gac.mcs178.gack.Utility;

public abstract class MagicScroll extends Scroll {
	
	int numUses;
	Boolean isMystery = true;
	String name;

	
	public MagicScroll(String title, Integer numUses) {
		super(title);
		this.numUses = numUses;
		this.name = title;
	}
	
	@Override
	public String getName() {
		// if name of the scroll is mystery, return a generic mystery title
		if (isMystery) {
			return "Scroll of ???";
		}
		// if the name of the scroll has been revealed, return the actual title
		return this.name;
	}
	
	
	public void reveal() {
		// reveal the type of scroll
		this.isMystery = false;
		// display a message saying the scroll was revealed
		Utility.displayMessage("The mysterious scroll is revealed to be: "+this.getName());
	}
	
	
	@Override
	public void beRead() {
		
		if (isMystery) {
			// the type of scroll is revealed if it was a mystery
			this.reveal();
		}
		
		if (numUses>0) {
		
		doMagic();
		numUses-=1;
		}
		else {
			Utility.displayMessage("Your "+super.getName()+" cannot be used anymore.");
		}
	}

	abstract void doMagic();
	


}
