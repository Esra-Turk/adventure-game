package game;
import player.*;
import location.*;
import java.util.*;
import characters.*;
import characters.Character;

public class Game {
	private Scanner input = new Scanner(System.in);
	public Location location;
	public String name;
	public Player p1;
	
	public void start() {
		System.out.println("Adventure Game");
		System.out.print("What is your name? Please enter the name: ");
		name = input.next();
		p1 = new Player(name);		
		System.out.println(p1.getName()+ "welcome to the island");
	}
	
	public void selectChar() {	
		System.out.println("Which character you want to be?\n"
				+ "-----------------------------------------\n"
				+ "1-Samuria\tDamage:5\tHealth:21\tmoney:15\n"
				+ "2-Archer\tDamage:7\tHealth:18\tmoney:20\n"
				+ "3-Knight\tDamage:3\tHealth:8\tmoney:24");
		
		while (true) {
			String charName = input.next();
			
			if(charName.equals("Samurai")) {
				Character s = new Samurai();
				p1.setDamage(s.getDamage());
				p1.setHealth(s.getHealth());
				p1.setWallet(s.getMoney());
				System.out.println("You are Samurai anymore. You have " + p1.getDamage() + " damage " + p1.getHealth() + " health " + p1.getWallet()+ " money");
				break;
			}
			
			else if(charName.equals("Knight")) {
				Knight k = new Knight();
				p1.setDamage(k.getDamage());
				p1.setHealth(k.getHealth());
				p1.setWallet(k.getMoney());
				System.out.println("You are Knight anymore. You have " + p1.getDamage() + " damage " + p1.getHealth() + " health " + p1.getWallet()+ " money");
				break;
			}
			
			else if(charName.equals("Archer")) {
				Archer a = new Archer();
				p1.setDamage(a.getDamage());
				p1.setHealth(a.getHealth());
				p1.setWallet(a.getMoney());
				System.out.println("You are Archer anymore. You have " + p1.getDamage() + " damage " + p1.getHealth() + " health " + p1.getWallet()+ " money");
				break;
			}
			
			else {
				System.out.println("You entered the invalid character.Please try again.");
			}	
		}		
	}
}
