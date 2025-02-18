package edu.gac.mcs178.gack.domain;


public class EnlightenmentScroll extends MagicScroll {



	public EnlightenmentScroll(String title, Integer numUses) {
		super(title, numUses);
	}

	@Override
	void magicalEffect() {
		
		//TODO write body
		// person gets a magic power added to their possessions
		this.getOwner().addMagicalPower("");
		
	}

}
