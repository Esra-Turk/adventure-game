package location.place;
import location.BattleLocation;
import obstacle.*;
import player.Player;

public class Forest extends BattleLocation {
	
	public Forest(Player player) {
		super(player,"Forest",new Vampire(),"firewood",3);
	}
}
