package location.place;
import location.BattleLocation;
import obstacle.*;
import player.*;

public class River extends BattleLocation {
	
	public River(Player player) {
		super(player,"River", new Bear(),"water",2);
	}

}
