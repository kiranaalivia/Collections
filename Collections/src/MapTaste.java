import java.util.HashMap;

public class MapTaste {
    public static void main(String[] args) {
        HashMap<String, String> foodtaste = new HashMap<>();

        foodtaste.put("Candy", "Sweet");
        foodtaste.put("Lemon", "Sour");
        foodtaste.put("Cheese", "Salty");
        foodtaste.put("Ayam Geprek", "Spicy");
        foodtaste.put("Herbal Medicine", "Bitter");

        System.out.println("Variety of foods and tastes " + foodtaste);

        //If i want to see one food taste only
        System.out.println(foodtaste.get("Ayam Geprek"));
    }
}
