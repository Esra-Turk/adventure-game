package player;
import inventory.*;

public class Player {
	protected int id;
	protected int damage;
	protected int health;
	private double money;
	private String charName;
	public String name;
	public Inventory inventory;
	
	public Player() {
	}
	
	public Player(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		this.health = health;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
