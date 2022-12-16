package location;

import player.*;

public class SafeHouse extends NormalLocation{
	public SafeHouse(Player player, String name) {
		super(player, name);
	}
	
	@Override
	public boolean onLocation() {
		return false;
	}
	
	public int updateHealty() {
		try {
			if(player.character.getId() == 1) {
				player.character.setHealth(21);
			}
			else if(player.character.getId() == 2) {
				player.character.setHealth(18);
			}
			else if(player.character.getId() == 3) {
				player.character.setHealth(24);
			}
			return player.character.getHealth();
		   
		} catch (Exception e) {
		      System.out.println("Something went wrong.Invalid character");
		      return 0;
		  }		
	}
}