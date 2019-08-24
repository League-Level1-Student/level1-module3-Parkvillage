package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld {
public static void main(String[] args) {
	World world= new World();
	world.show();
	Bug bug = new Bug();
	Location location= new Location(5, 5);
	Bug bug2= new Bug();
	Location location2= new Location(3, 5);
	bug2.setColor(Color.black);
	world.add(location, bug);
	world.add(location2, bug2);
	bug.turn();
}
}
