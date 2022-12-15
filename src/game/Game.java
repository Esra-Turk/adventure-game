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
	
	public void start() {
		System.out.println("Welcome to Adventure Game");
		System.out.print("What is your name? Please enter the name: ");
		name = input.next();
		Player p1 = new Player(name);		
	}
	
	public void selectChar() {
		System.out.print("Which character you want to be? 1-Samuria\n 2-Archer\n3-Knight");
		String charName = input.next();
		
		if(charName == "Samurai") {
			Samurai s = new Samurai();
			System.out.println("******");
		}
		
		else if(charName == "Knight") {
			Knight k = new Knight();			
		}
		
		else if(charName == "Archer") {
			Archer a = new Archer();
		}
			
	}
}
