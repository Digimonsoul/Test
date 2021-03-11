import java.util.LinkedList;

/**
 * Created by ew7100 on 2/25/2021.
 */
public class Character {

    String Name;
    String Species;
    String Gender;
    String Watcher;
    LinkedList<Inventory> CharacterInventory = new LinkedList<>();

    public Character(String Name, String Species, String Gender,
                          String Watcher){
        this.Name=Name;
        this.Species=Species;
        this.Gender=Gender;
        this.Watcher=Watcher;
    }
}