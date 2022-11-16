import java.util.LinkedList;

public class StackName {
    public static void main (String [] args){
        LinkedList<String> PronouneceMyName = new LinkedList<>();
        PronouneceMyName.push ("A");
        PronouneceMyName.push ("N");
        PronouneceMyName.push ("A");
        PronouneceMyName.push ("R");
        PronouneceMyName.push ("I");
        PronouneceMyName.push ("K");

        System.out.println("Linked List : " + PronouneceMyName);
        System.out.println("stack size : " + PronouneceMyName.size());

        while (!PronouneceMyName.isEmpty())
            System.out.println(PronouneceMyName.pop());
        System.out.println("Linked List : " + PronouneceMyName);
    }
}