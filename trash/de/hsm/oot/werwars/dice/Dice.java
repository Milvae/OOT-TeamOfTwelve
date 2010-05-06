package de.hsm.oot.werwars.dice;

import java.io.FileNotFoundException;

public class Dice {
	private Symbol[] symbols;
	public Dice() throws FileNotFoundException {
		this(new Symbol[]{new Symbol(1),new Symbol(2),new Symbol(3),new Symbol(4),new Ghost(5),new Ghost(6)});
	}
	public Dice(Symbol[] symbols) {
		this.symbols = symbols;
	}
	public Symbol roll() {
		if(symbols.length!=0)
			return symbols[(int)Math.random()*symbols.length];
		else throw new CantRollEmptyDiceError();
	}
}