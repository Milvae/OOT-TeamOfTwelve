package de.hsm.oot.werwars.rooms;

import de.hsm.oot.werwars.Chest;
import de.hsm.oot.werwars.Person;
import de.hsm.oot.werwars.animals.Animal;
import de.hsm.oot.werwars.forages.Forage;

public class Room {
	private Forage forage; //in each room there is a hidden forage
	private Animal animal; //in each room there is an animal
	private Chest chest; //in each room is a chest, which is owned by a suspect
	private Room[] connected; //each room is connected to other rooms
	private Person[] persons; //each room can hold several persons (ghost or players)
}
