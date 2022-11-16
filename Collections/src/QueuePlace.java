import java.util.LinkedList;
import java.util.Queue;

public class QueuePlace {

    public static void main (String[] args){
        Queue<String> IndoorPlace = new LinkedList<>();
        Queue<String> OutdoorPlace = new LinkedList<>();

        IndoorPlace.add("Salon");
        IndoorPlace.add("Gym");
        IndoorPlace.add("Book Store");
        IndoorPlace.add("Shop");
        OutdoorPlace.add("Parking Lot");

        System.out.println("Indoor Places at the mall : " + IndoorPlace);

        //also if I want to know Outdoor Place :
        //System.out.println("Outdoor Places at the mall : " + OutdoorPlace);

    }

}