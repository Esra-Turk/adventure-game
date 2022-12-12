package location;

import player.Player;

public class ToolStore extends NormalLocation{

	public ToolStore(Player player, String name) {
		super(player, name);
	}
	
	@Override
	public boolean onLocation() {
		return false;
	}
	
	public void buy() {
		
	}
	
	public String menu() {
		return "";
		
	}

}
