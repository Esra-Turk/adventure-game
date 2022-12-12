package armor;

public class Armor {
	private int id;
	private int block;
	private double money;
	
	public Armor(int id, int block, double money) {
		this.id = id;
		this.block = block;
		this.money = money;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
