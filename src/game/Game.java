package game;
import player.*;
import location.*;
import java.util.*;

public class Game {
	public Location location;
	public static Player player;
	public static String name;
	
	public static void start() {
		SafeHouse s = new SafeHouse(player, name);
		s.updateHealty();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Adventure Game");
		System.out.print("Which you want to be character?\nPlease enter the name \n1-Samurai\n2-Archer\n3-Knight: ");
		name = input.next();
		player.selectChar(name);
		start();
	}
}
