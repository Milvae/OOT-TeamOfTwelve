package de.hsm.oot.werwars.forages;

import java.io.FileNotFoundException;

public class Bread extends Forage {
	public Bread() throws FileNotFoundException {
		super("Bread",Forage.getIcon("bread.png"));
	}
}
