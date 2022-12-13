package characters;

public class Character {
	private int id;
	private int damage;
	private int healty;
	private double money;
	
	public Character(int id,int damage,int healty,double money) {
		this.id = id;
		this.damage = damage;
		this.healty = healty;
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

	public int getHealty() {
		return healty;
	}

	public void setHealty(int healty) {
		this.healty = healty;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
