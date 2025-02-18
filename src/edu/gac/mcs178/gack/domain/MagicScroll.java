package edu.gac.mcs178.gack.domain;

import edu.gac.mcs178.gack.Utility;

public abstract class MagicScroll extends Scroll {
	
	int numUses;
	String title;

	
	public MagicScroll(String title, Integer numUses) {
		super(title);
		this.numUses = numUses;
	}
	
	@Override
	public void beRead() {
		
		if (numUses>0) {
		
		magicalEffect();
		numUses-=1;
		}
		else {
			Utility.displayMessage("Your "+super.getName()+" cannot be used anymore.");
		}
	}

	abstract void magicalEffect();
	


}
