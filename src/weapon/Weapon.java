package weapon;

public class Weapon {
	private int id;
	private int damage;
	private int money;
	
	public Weapon(int id, int damage, int money) {
		this.id = id;
		this.damage = damage;
		this.money = money;
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
