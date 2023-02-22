package location;

import player.*;

public class SafeHouse extends NormalLocation{
	public SafeHouse(Player player, String name) {
		super(player, name);
		System.out.println("You are in the safe house. Your healthy is updated");

	}
	
	@Override
	public boolean onLocation() {
		return true;
	}
	
	public int updateHealty() {
		try {
			if(player.getCharacter().getId() == 1) {
				player.getCharacter().setHealth(21);
			}
			else if(player.getCharacter().getId() == 2) {
				player.getCharacter().setHealth(18);
			}
			else if(player.getCharacter().getId() == 3) {
				player.getCharacter().setHealth(24);
			}
			return player.getCharacter().getHealth();
		   
		} catch (Exception e) {
		      System.out.println("Something went wrong.Invalid character");
		      return 0;
		  }		
	}
}