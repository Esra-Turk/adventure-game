package location;

import player.*;

public class SafeHouse extends NormalLocation{

	public SafeHouse(Player player, String name) {
		super(player, name);
	}
	
	@Override
	public boolean onLocation() {
		return true;
	}
	
	public int updateHealty() {
		return 2;
	}
	

}
