package location;
import obstacle.*;
import player.Player;
import java.util.Random;
import java.util.Scanner;

public abstract class BattleLocation extends Location{
	private Player player;
	private String name;
	private Obstacle obstacle;
	private String prize;
	private int maxObstacle;
	private int obstacleNumber ;
	private String selectState;
	private Random r;
	private Scanner scan;

	public BattleLocation(Player player,String name,Obstacle obstacle,String prize, int maxObstacle) {
		this.player = player;
		this.name = name;
		this.obstacle = obstacle;
		this.prize =prize;
		this.maxObstacle = maxObstacle;
		this.scan = new Scanner(System.in);
	}

	@Override
	public boolean onLocation() {
		System.out.println("You are in " + this.getName());
		System.out.println("Be careful! "
				+ this.randomObstacle() + " "
				+ this.getObstacle().getName().toLowerCase() + "s live here");
		System.out.println("-------------------------------");
		System.out.print("You have two choices: Fight or Flight: ");
		selectState =scan.nextLine().toLowerCase();
		System.out.println();
		setObstacleDamage();

		switch (selectState) {
			case "fight":
				fight();
				break;
			case "flight":
				break;
			default:
				System.out.println("wrong state");
				break;
		}

		if(this.player.getInventory().isWater() && this.player.getInventory().isFood() && this.player.getInventory().isFirewood()){
			System.out.println("YOU WON THE GAME!!See you again");
			System.exit(0);
		}
		return true;

	}

	public int randomObstacle() {
		r = new Random();
		return obstacleNumber  = r.nextInt(this.getMaxObstacle()) + 1;
	}

	public void setObstacleDamage() {
		this.obstacle.setDamage(this.obstacle.getDamage() -this.player.getInventory().getArmorDefence());
	}

	public void getSnakePrize(){
		int num = r.nextInt(100);

		if(num < 3){
			this.player.getInventory().setWeaponName("Rifle");
			this.player.setDamage(this.player.getDamage() + 7);
			System.out.println("You earned rifle.Your new damage is " + this.player.getDamage());
		}
		else if(num < 8){
			this.player.getInventory().setWeaponName("Sword");
			this.player.setDamage(this.player.getDamage() + 3);
			System.out.println("You earned sword.Your new damage is " + this.player.getDamage());

		}
		else if (num < 15) {
			this.player.getInventory().setWeaponName("Gun");
			this.player.setDamage(this.player.getDamage() + 2);
			System.out.println("You earned gun. Your new damage is" + this.player.getDamage());
		}
		else if(num < 18) {
			this.player.getInventory().setArmorName("Heavy");
			System.out.println("Your earned heavy armor");
		}
		else if(num < 23) {
			this.player.getInventory().setArmorName("Medium");
			System.out.println("You earned medium armor");
		}
		else if(num < 30) {
			this.player.getInventory().setArmorName("Light");
			System.out.println("You earned light armor");
		}
		else if(num < 35){
			this.player.setMoney(this.player.getMoney() + 10);
			System.out.println("You earned 10 money. Your new balance is " + this.player.getMoney());
		}
		else if(num < 42){
			this.player.setMoney(this.player.getMoney() + 5);
			System.out.println("You earned 5 money Your new balance is " + this.player.getMoney());
		}
		else if(num < 55){
			this.player.setMoney(this.player.getMoney() + 1);
			System.out.println("You earned 1 money Your new balance is " + this.player.getMoney());
		}
		else{
			System.out.println("You earned anything");
		}

	}

	//get prize inventory bear -> water | vampire -> firewood | zombie -> food
	public void getInventoryPrize() {
		String obstacleName = this.obstacle.getName();

		switch (obstacleName) {
			case "Bear" -> {
				this.player.getInventory().setWater(true);
				System.out.println("You earned water for killing the " + this.obstacle.getName());
			}
			case "Vampire" -> {
				this.player.getInventory().setFirewood(true);
				System.out.println("You earned food for killing the " + this.obstacle.getName());
			}
			case "Zombie" -> {
				this.player.getInventory().setFood(true);
				System.out.println("You earned food for killing the " + this.obstacle.getName());
			}
			case "Snake" -> getSnakePrize();
		}
	}

	//get obstacle money
	public void getObstacleMoney() {
		System.out.println("Your old balance is " + this.player.getMoney());
		System.out.println("The obstacle(s) had " + this.obstacle.getMoney() * this.getObstacleNumber());
		this.player.setMoney(this.player.getMoney() + this.obstacle.getMoney() * this.getObstacleNumber());
		System.out.println("Your new balance is " + this.player.getMoney());
	}

	public void fight() {
		System.out.println("----Health Status Of The Characters----");
		this.obstacle.setHealth(this.obstacle.getHealth() * this.getObstacleNumber());
		System.out.println(this.player.getName() + " --> " + this.player.getHealth() + "\n"
				+ this.obstacle.getName() + "(s)--> " + this.obstacle.getHealth()
				+ "\n----------------------------------------");

		while(this.player.getHealth() > 0 && this.getObstacle().getHealth() > 0) {
			hit();
		}
	}

	public void hit() {
		int chance = (int) (Math.random() * 10);
		//System.out.println(chance);

		if(chance <= 5 ) {
			//player hits to obstacle
			if(this.player.getHealth() > 0) {
				this.obstacle.setHealth(this.obstacle.getHealth()- this.player.getDamage());
				System.out.println(this.player.getName()
						+ " dealt " + this.player.getDamage()
						+ " damage to " + this.obstacle.getName()
						+ "\nNew Health Status\n" + this.player.getName() + "--> " + this.player.getHealth()
						+ "\n" + this.obstacle.getName() + "--> " + this.obstacle.getHealth());
				System.out.println("----------------------------------------");
			}
		}

		if(chance > 5) {
			//obstacle hits to player
			if(this.obstacle.getHealth() > 0) {
				this.player.setHealth(this.player.getHealth() - this.obstacle.getDamage());
				System.out.println(this.obstacle.getName()
						+ " dealt " + this.obstacle.getDamage()
						+ " damage to " +this.player.getName()
						+ "\nNew Health Status\n" + this.player.getName() + "--> " + this.player.getHealth()
						+ "\n" + this.obstacle.getName() + "--> " + this.obstacle.getHealth());
				System.out.println("----------------------------------------");
			}
		}

		//print winner after the fight
		 if(this.obstacle.getHealth() <= 0) {
			System.out.println(this.obstacle.getName() + " is dead..Your health: " + this.player.getHealth());
			System.out.println();

			getObstacleMoney();
			getInventoryPrize();

		}
		else if(this.player.getHealth() <= 0) {
			System.out.println("You are dead.."
					+ this.obstacle.getName() + "'s health: " + this.obstacle.getHealth()
					+ " Your health: " + this.player.getHealth());
			System.out.println("GAME OVER!! See you again");
			System.exit(0);
		}
	}


	public Obstacle getObstacle() {
		return obstacle;
	}

	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxObstacle() {
		return maxObstacle;
	}

	public void setMaxObstacle(int maxObstacle) {
		this.maxObstacle = maxObstacle;
	}

	public int getObstacleNumber() {
		return obstacleNumber;
	}

	public void setObstacleNumber(int obstacleNumber) {
		this.obstacleNumber = obstacleNumber;
	}
}
