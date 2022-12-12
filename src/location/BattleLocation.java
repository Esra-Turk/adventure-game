package location;
import player.*;
import obstacle.*;

public abstract class BattleLocation extends Location{
	public Obstacle obstacle;
	

	public BattleLocation(Obstacle o) {
		super();
		this.obstacle = o;
	}
	
	@Override
	public boolean onLocation() {
		return false;
	}
	
	public void combat() {
		
	}
}
