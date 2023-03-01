package player;
import inventory.*;
import characters.Character;

public class Player {
	private String name;
	private double money;
	private int damage;
	private int health;
	private Inventory inventory = new Inventory();
	private Character character;
	public int id;
	
	public Player(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health < 0 ){
			health = 0;
		}
		this.health = health;
	}

	public int getId() {
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}
}