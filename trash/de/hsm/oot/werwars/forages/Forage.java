package de.hsm.oot.werwars.forages;

import java.io.FileNotFoundException;

import javax.swing.ImageIcon;

import de.hsm.oot.werwars.Guitilities;

public class Forage {
	private String name; //the name of the forage
	private ImageIcon graphic; //the graphic represntation of the forage
	
	public Forage() {}
	protected Forage(String name,ImageIcon graphic) {
		this.name = name;
		this.graphic = graphic;
	}
	
	protected static ImageIcon getIcon(String name) throws FileNotFoundException {
		return Guitilities.createImageIcon(new StringBuilder("forages/").append(name).toString());
	}
}
