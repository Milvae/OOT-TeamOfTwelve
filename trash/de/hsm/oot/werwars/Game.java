package de.hsm.oot.werwars;

import de.hsm.oot.werwars.animals.Animal;
import de.hsm.oot.werwars.forages.Forage;

public class Game {
	private Clock clock; //the game has got a clock
	
	private Board board; //the game has got a board
	private Animal[] animals; //the game has got a number of animals (for the different rooms)
	private Forage[] forages; //the game has got a number of forages (for the different rooms)
	
	private Ghost ghost; //the game has got a ghost
	private Player[] players; //the game has got one or multiple playsers
	
	public Game() {
		this.board = new Board();
	}
	
	public Board getBoard() {
		return board;
	}
}
