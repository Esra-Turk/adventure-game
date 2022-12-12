package player;
import characters.*;
import java.util.*;;

public class Player {
	public String name;
	public Inventory inventory;
	
	public void selectChar() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Which do you want to be character?\nPlease enter the name \n1-Samurai\n2-Archer\n3-Knight: ");
		name = scan.next();
		
		if(name == "Samurai") {
		}
		
		if(name == "Knight") {
			
		}
		
		if(name == "Archer") {
			
		}
	}
	
}
