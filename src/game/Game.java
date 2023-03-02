package game;
import location.place.*;
import player.*;
import location.*;
import java.util.*;
import characters.*;
import characters.Character;

public class Game {
	private final Scanner input;
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
		System.out.println("____________________________________________________\n"
				+ "\tWhich character you want to be? \n"
				+ "\t1-Samurai\tDamage:5\tHealth:21\tmoney:25\n"
				+ "\t2-Archer\tDamage:7\tHealth:18\tmoney:20 \n"
				+ "\t3-Knight\tDamage:8\tHealth:24\tmoney:5 \n"
				+ "____________________________________________________");
	}
	
	private void printLocation() {
		System.out.println("______________________________________________________________________________\n"
				+ "\tWhere dou you want to go? \n"
				+ "\t1-Tool Store\tYou can buy weapon and armor\n"
				+ "\t2-Safe House\tYour health will be restore.\n"
				+ "\t3-Cave\t\tGo to the cave but be careful! Zombies are everywhere\n"
				+ "\t4-River\t\tGo to the river but be careful! Bears are everywhere\n"
				+ "\t5-Forest\t\tGo to the forest but be careful!Vampires are everywhere\n"
				+ "\t4-Mine\t\tGo to the mine but be careful! Snakes are everywhere\n"
				+ "_______________________________________________________________________________");
	}
	
	
	public void selectChar() {
		printChar();
		label:
		while (true) {
			System.out.print("Enter the character name: ");
			String charName = input.next();

			switch (charName) {
				case "Samurai":
					Character s = new Samurai();
					player.setId(s.getId());
					player.setDamage(s.getDamage());
					player.setHealth(s.getHealth());
					player.setMoney(s.getMoney());
					System.out.println("You are Samurai anymore. You have "
							+ player.getDamage() + " damage "
							+ player.getHealth() + " health "
							+ player.getMoney() + " money");
					break label;
				case "Knight":
					Knight k = new Knight();
					player.setId(k.getId());
					player.setDamage(k.getDamage());
					player.setHealth(k.getHealth());
					player.setMoney(k.getMoney());
					System.out.println("You are Knight anymore. You have "
							+ player.getDamage() + " damage "
							+ player.getHealth() + " health "
							+ player.getMoney() + " money");
					break label;
				case "Archer":
					Archer a = new Archer();
					player.setId(a.getId());
					player.setDamage(a.getDamage());
					player.setHealth(a.getHealth());
					player.setMoney(a.getMoney());
					System.out.println("You are Archer anymore. You have "
							+ player.getDamage() + " damage "
							+ player.getHealth() + " health "
							+ player.getMoney() + " money");
					break label;
				default:
					System.out.print("You entered the invalid character.Please try again:");
					break;
			}
		}
	}
	
	public void selectLocation() {
		printLocation();
		String locName = input.nextLine();
		
		while(true) {
			System.out.print("Please enter the location:");
			locName = input.nextLine();

			switch (locName) {
				case "Tool Store" -> {
					location = new ToolStore(player, name);
					location.onLocation();
				}
				case "Safe House" -> {
					location = new SafeHouse(player, name);
					location.onLocation();
				}
				case "Cave" -> {
					if (!this.player.getInventory().isFood()) {
						location = new Cave(player);
						location.onLocation();
					} else {
						System.out.println("You can't go back the cave because you've won a prize before");
					}
				}
				case "River" -> {
					if (!this.player.getInventory().isWater()) {
						location = new River(player);
						location.onLocation();
					} else {
						System.out.println("You can't go back the river because you've won a prize before");
					}
				}
				case "Forest" -> {
					if (!this.player.getInventory().isFirewood()) {
						location = new Forest(player);
						location.onLocation();
					} else {
						System.out.println("You can't go back the forest because you've won a prize before");
					}
				}
				case "Mine" -> {
					location = new Mine(player);
					location.onLocation();
				}
				case "exit" -> {
					System.out.println("You are leaving the game.. See you soon");
					System.exit(0);
				}
				default -> {
					location = new SafeHouse(player, name);
					location.onLocation();
					System.out.println("Wrong location but you still are in the safe house");
				}
			}

			System.out.println();

			}
		}
	}


