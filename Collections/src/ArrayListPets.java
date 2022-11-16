import java.util.ArrayList;
import java.util.List;

public class ArrayListPets{
    public static void main(String[] args) {
        List<String> pets = new ArrayList<>();

        pets.add("Cat");
        pets.add("Dog");
        pets.add("Rabbit");
        pets.add("Hamster");
        pets.add("Turtle");

        System.out.println("Pets I own : " + pets);
    }   
}
