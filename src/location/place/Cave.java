package location.place;
import location.BattleLocation;
import obstacle.*;
import player.Player;

public class Cave extends BattleLocation {
	
	public Cave(Player player) {
		super(player,"Cave", new Zombie(),"food",3);
	}

}
