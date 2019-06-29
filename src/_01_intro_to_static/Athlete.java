package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        bibNumber=nextBibNumber++;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	Athlete Usain_bolt= new Athlete("Usain", 100);
    	System.out.println(Usain_bolt.name);
    	System.out.println(Usain_bolt.bibNumber);
    	System.out.println(Usain_bolt.raceLocation);
    	Athlete Michal_Phelps= new Athlete("Michal_Phelps", 150);
    	System.out.println(Michal_Phelps.name);
    	System.out.println(Michal_Phelps.bibNumber);
    	raceLocation="San Diego";
    	System.out.println(Michal_Phelps.raceLocation);
    	System.out.println(Michal_Phelps.speed);
    	
    	    }
}
