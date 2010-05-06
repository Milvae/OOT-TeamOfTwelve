package de.hsm.oot.werwars;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;

import de.hsm.oot.werwars.dice.Dice;

public class Gamemaster extends Frame {
	private Game game; //the gamemaster is the master of the game
	private Dice dice; //and holds the dice
	private Player player; //and has got a player which is currently on turn
	
	public Gamemaster() {
		this.add((game = new Game()).getBoard(),BorderLayout.CENTER);
		
	}
	
	public static void main(String args[]) {
		Gamemaster gamemaster = new Gamemaster();
		gamemaster.setSize(new Dimension(930,624));
		gamemaster.setVisible(true);
	}
}
