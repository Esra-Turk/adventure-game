package location.place;

import location.BattleLocation;
import obstacle.Snake;
import player.Player;

public class Mine extends BattleLocation {

    public Mine(Player player) {
        super(player,"Mine",new Snake(),null, 5);
    }
}
