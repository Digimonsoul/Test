import java.util.LinkedList;

/**
 * Created by ew7100 on 2/25/2021.
 */
public class Character {

    String Name;
    String Species;
    String Gender;
    String Element;
    LinkedList<Inventory> CharacterInventory = new LinkedList<>();

    public void Character(String Name, String Species, String Gender,
                          String Element){
        this.Name=Name;
        this.Species=Species;
        this.Gender=Gender;
        this.Element=Element;
    }

}