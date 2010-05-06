package de.hsm.oot.werwars.rooms;

import de.hsm.oot.werwars.Person;
import de.hsm.oot.werwars.animals.Animal;
import de.hsm.oot.werwars.forages.Forage;
import de.hsm.oot.werwars.rooms.doors.Door;
import de.hsm.oot.werwars.suspects.Chest;

public abstract class Room {
	private Forage forage; //in each room there is a hidden forage
	private Animal animal; //in each room there is an animal
	private Chest chest; //in each room is a chest, which is owned by a suspect
	private Room[] connected; //each room is connected to other rooms
	private Person[] persons; //each room can hold several persons (ghost or players)
	private Door[] doors; //each room may have got several doors
}
