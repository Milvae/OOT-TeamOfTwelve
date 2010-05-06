package de.hsm.oot.werwars.dice;

import java.io.FileNotFoundException;

import de.hsm.oot.werwars.Guitilities;

public class Ghost extends Symbol {
	public Ghost(int value) throws FileNotFoundException {
		super(value,"symbol_ghost.png");
	}
}
