package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World w= new World();
	Location l= new Location(8, 4);
	Bug b= new Bug();
	w.show();
	w.add(l, b);

	
}
}
