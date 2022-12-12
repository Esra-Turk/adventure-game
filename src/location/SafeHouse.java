package location;

import player.Player;

public class SafeHouse extends NormalLocation{

	public SafeHouse(Player player, String name) {
		super(player, name);
	}
	
	@Override
	public boolean onLocation() {
		return true;
	}
	

}
