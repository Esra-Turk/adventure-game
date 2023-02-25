package location;

import player.*;

public class SafeHouse extends NormalLocation{
	public SafeHouse(Player player, String name) {
		super(player, name);
	}
	
	@Override
	public boolean onLocation() {
		System.out.println("You are in the safe house. Your healthy is updated");
		updateHealth();
		return true;
	}
	
	public void updateHealth() {
		try {
			if(this.player.getId() == 1) {
				this.player.setHealth(21);
			}
			else if(this.player.getId() == 2) {
				this.player.setHealth(18);
			}
			else if(this.player.getId() == 3) {
				this.player.setHealth(24);
			}
		   
		} catch (Exception e) {
		      System.out.println("Something went wrong.Invalid character");
		  }		
	}
}