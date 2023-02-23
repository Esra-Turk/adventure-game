package location;
import obstacle.*;
import player.Player;
import java.util.Random;
import java.util.Scanner;

public abstract class BattleLocation extends Location{
	private String name;
	private Obstacle obstacle;
	private String prize;
	private int maxObstacle;
	private int obstacleNumber ;
	private String selectState;
	private Random r;
	private Scanner scan;
	public BattleLocation(Player player,String name,Obstacle obstacle,String prize, int maxObstacle) {
		this.name = name;
		this.obstacle = obstacle;
		this.prize =prize;
		this.maxObstacle = maxObstacle;
		this.scan = new Scanner(System.in);
	}

	public int randomObstacle() {
		r = new Random();
		return obstacleNumber  = r.nextInt(this.getMaxObstacle()) + 1;
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
		return true;
	}

	
	public void fight() {
		
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
