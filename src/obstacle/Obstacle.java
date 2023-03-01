package obstacle;
import java.util.Random;

public class Obstacle {
	private String name;
	private int id;
	private int damage;
	private int health;
	private double money;


	public Obstacle(String name, int id, int damage, int health, double money) {
		this.name = name;
		this.id = id;
		this.damage = damage;
		this.health = health;
		this.money = money;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
		if(health < 0 ){
			health = 0;
		}
		this.health = health;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
