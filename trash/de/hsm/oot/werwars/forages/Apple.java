package de.hsm.oot.werwars.forages;

import java.io.FileNotFoundException;

public class Apple extends Forage {
	public Apple() throws FileNotFoundException {
		super("Apple",Forage.getIcon("apple.png"));
	}
}
