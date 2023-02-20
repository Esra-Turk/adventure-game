package location;
import player.*;

public abstract class Location {
	public Player player;
	public String name;
	
	public Location() {}
	
	public Location(Player player, String name) {
		this.player = player;
		this.name = name;
	}
	
	public abstract boolean onLocation();
}
