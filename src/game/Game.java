package game;
import player.*;
import location.*;
import java.util.*;
import characters.*;

public class Game {
	private Scanner input = new Scanner(System.in);
	public Location location;
	public Player player;
	public String name;
	public Player p1;
	
	public void start() {
		System.out.println("Welcome to Adventure Game");
		System.out.print("What is your name? Please enter the name: ");
		name = input.next();
		p1 = new Player(name);		
	}
	
	public void selectChar() {
		while (true) {
			System.out.print("Which character you want to be? 1-Samuria\n 2-Archer\n3-Knight");
			String charName = input.next();
			
			if(charName == "Samurai") {
				Samurai s = new Samurai();
				p1.character = s;
				break;
			}
			
			else if(charName == "Knight") {
				Knight k = new Knight();
				p1.character = k;
				break;
			}
			
			else if(charName == "Archer") {
				Archer a = new Archer();
				p1.character = a;
				break;
			}
			
			else {
				System.out.println("You entered the invalid character.Please try again.");
			}	
		}		
	}
}
