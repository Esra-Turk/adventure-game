package player;
import characters.Character;
import characters.*;
import inventory.*;

public class Player {
	public String name;
	public Inventory inventory;
	public Character character;
	
	private double wallet = 50;
	
	public double getWallet() {
		return wallet;
	}

	public void setWallet(double wallet) {
		this.wallet = wallet;
	}

	public void selectChar(String name) {		
		if(name == "Samurai") {
			Samurai s = new Samurai(1, 5, 21, 15);
		}
		
		if(name == "Knight") {
			Knight k = new Knight(3, 8, 24, 5);
			
		}
		
		if(name == "Archer") {
			Archer a = new Archer(2, 7, 18, 20);
			
		}
	}
	
}
