import java.util.HashSet;

public class SetMarble {
    public static void main(String[] args) {
        HashSet<String> marbles = new HashSet<>();

        marbles.add("Blue");
        marbles.add("Red");
        marbles.add("Purple");
        marbles.add("Yellow");
        marbles.add("Green");

        System.out.println("Colors of marbles in a bag : " + marbles);
    }
}