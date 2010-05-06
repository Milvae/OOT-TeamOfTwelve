package de.hsm.oot.werwars;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.io.FileNotFoundException;

import de.hsm.oot.werwars.rooms.Room;

public class Board extends Container {
	private Room[] rooms; //the board has got several rooms
	
	public void paint(Graphics g) {
		try {
			g.drawImage(Guitilities.createImageIcon("board.png").getImage(),0,0,this.getWidth(),this.getHeight(),Color.WHITE,this);
		}	catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			super.paint(g);
		}		
	}
}
