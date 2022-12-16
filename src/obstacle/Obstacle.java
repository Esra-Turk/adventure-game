package obstacle;

public class Obstacle {
	private int id;
	private int damage;
	private int healty;
	private double money;
	public int number; //it will be random number
	
	public Obstacle(int id, int damage,int healty,double money) {
		this.id = id;
		this.damage = damage;
		this.healty = healty;
		this.money = money;
	}
	
	// generate random number, between 1 and 3
	public int obstacleNumber() {
		number = ((int)Math.floor(Math.random()*3 + 1));
		return number;
		
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
