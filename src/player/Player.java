package player;
import inventory.*;
import characters.Character;

public class Player {
	public String name;
	public Inventory inventory;
	public Character character;
	
	public Player(String name) {
		this.name = name;
	}
}