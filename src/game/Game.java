package game;
import player.*;
import location.*;
import java.util.*;
import characters.*;
import characters.Character;

public class Game {
	private Scanner input;
	public Location location;
	public String name;
	public Player player;
	
	public Game() {
		this.input = new Scanner(System.in);
	}

	public void start() {
		System.out.println("Adventure Game");
		System.out.print("What is your name? Please enter the name: ");
		name = input.next();
		player = new Player(name);		
		System.out.println(player.getName()+ " welcome to the island");
	}
	
	private void printChar() {
		System.out.println("_________________________________________________________________\n"
				+ "|\tWhich character you want to be? \t\t\t" + " " + "|\n"
				+ "|\t1-Samuria\tDamage:5\tHealth:21\tmoney:15 |\n"
				+ "|\t2-Archer\tDamage:7\tHealth:18\tmoney:20 |\n"
				+ "|\t3-Knight\tDamage:3\tHealth:8\tmoney:24 |\n"
				+ "|________________________________________________________________|");
	}
	
	private void printLocation() {
		System.out.println("________________________________________________________\n"
				+ "|\tWhere dou you want to go? \t\t\t|\n"
				+ "|\t1-Tool Store\tYou can buy weapon and armor\t|\n"
				+ "|\t2-Safe House\tYour health will be restore.\t|\n"
				+ "|_______________________________________________________|");
	}
	
	
	public void selectChar() {
		printChar();
		while (true) {
			System.out.print("Enter the character name: ");
			String charName = input.next();
			
			if(charName.equals("Samurai")) {
				Character s = new Samurai();
				player.setId(s.getId());
				player.setDamage(s.getDamage());
				player.setHealth(s.getHealth());
				player.setWallet(s.getMoney());
				System.out.println("You are Samurai anymore. You have "
							+ player.getDamage() + " damage " 
							+ player.getHealth() + " health " 
							+ player.getWallet()+ " money");
				break;
			}
			
			else if(charName.equals("Knight")) {
				Knight k = new Knight();
				player.setId(k.getId());
				player.setDamage(k.getDamage());
				player.setHealth(k.getHealth());
				player.setWallet(k.getMoney());
				System.out.println("You are Knight anymore. You have "
						+ player.getDamage() + " damage " 
						+ player.getHealth() + " health " 
						+ player.getWallet()+ " money");
				break;
			}
			
			else if(charName.equals("Archer")) {
				Archer a = new Archer();
				player.setId(a.getId());
				player.setDamage(a.getDamage());
				player.setHealth(a.getHealth());
				player.setWallet(a.getMoney());
				System.out.println("You are Archer anymore. You have " 
						+ player.getDamage() + " damage " 
						+ player.getHealth() + " health " 
						+ player.getWallet()+ " money");
				break;
			}
			
			else {
				System.out.print("You entered the invalid character.Please try again:");
			}	
		}
	
	}
	
	public void selectLocation() {
		printLocation();
		String locName = input.nextLine();
		
		while(true) {
			System.out.print("Please enter the location:");
			locName = input.nextLine();
			
			if(locName.equals("Tool Store")) {
				location = new ToolStore(player,name);
			} 
			else if (locName.equals("Safe House")) {
				location = new SafeHouse(player,name);
			} 
			else if (locName.equals("exit")) {
				System.out.println("You are leaving the game.. See you soon");
				System.exit(0);
			} 
			else {
				System.out.println("Wrong location but you still are in the safe house");
			}
		}
	}
}

