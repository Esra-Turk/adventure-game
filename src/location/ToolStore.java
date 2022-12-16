package location;
import player.*;
import armor.*;
import inventory.*;
import weapon.*;
import java.util.*;

public class ToolStore extends NormalLocation {
	public int id;
	public String type;
	public Scanner input;
	
	Gun gun = new Gun();
	Sword sword = new Sword();
	Rifle rifle = new Rifle();
	Light light = new Light();
	Medium medium = new Medium();
	Heavy heavy = new Heavy();

	public ToolStore(Player player, String name) {
		super(player, name);
		
		this.input = new Scanner(System.in);
		System.out.print("Please enter the id that you want to buy weapon or armor");
		this.id = input.nextInt();
		
		System.out.print("Please enter the type that you want to buy weapon or armor");
		this.type = input.next();
	}
	
	@Override
	public boolean onLocation() {
		return false;
	}
		
	public void buy() {
		Inventory inv = null;
		
		if(type == "armor" && player.getWallet() > light.getMoney()) {
			switch(id) {
			case 1:
				double money = player.getWallet() - light.getMoney();
				int increaseArmor = inv.getCountArmor()+1;
				player.setWallet(money);
				inv.setCountArmor(increaseArmor);
				System.out.println("You bought the light armor. Count of armor is "+ inv.getCountArmor()+ "\nYou have " + money + " dolars anymore.");
				break; 
			
			case 2:
				double money2 = player.getWallet() - medium.getMoney();
				player.setWallet(money2);
				inv.setCountArmor(inv.getCountArmor() + 1);
				System.out.println("You bought the medium armor. Count of armor is "+ inv.getCountArmor()+ "\nYou have " + money2 + " dolars anymore.");
			
			
			case 3:
				double money3 = player.getWallet() - heavy.getMoney();
				player.setWallet(money3);
				inv.setCountArmor(inv.getCountArmor() + 1);
				System.out.println("You bought the heavy armor. Count of armor is"+ inv.getCountArmor()+ "\nYou have " + money3 + " dolars anymore.");
				break;
				
			default:
				System.out.println("Please enter the id 1-2-3 ");
			}
		}
		
		if(type == "weapon" && player.getWallet() > light.getMoney()) {
			switch(id) {
			case 1:
				double money = player.getWallet() - gun.getMoney();
				player.setWallet(money);
				inv.setCountArmor(inv.getCountArmor()+1);
				System.out.println("You bought the light armor. Count of armor is "+ inv.getCountArmor()+ "\nYou have " + money + " dolars anymore.");
				break;
			case 2:
				double money2 = player.getWallet() - medium.getMoney();
				player.setWallet(money2);
				inv.setCountArmor(inv.getCountArmor() + 1);
				System.out.println("You bought the medium armor. Count of armor is "+ inv.getCountArmor()+ "\nYou have " + money2 + " dolars anymore.");
				break;
				
			case 3:
				double money3 = player.getWallet() - heavy.getMoney();
				player.setWallet(money3);
				inv.setCountArmor(inv.getCountArmor() + 1);
				System.out.println("You bought the heavy armor. Count of armor is"+ inv.getCountArmor()+ "\nYou have " + money3 + " dolars anymore.");
	 			break;
	 		default:
				System.out.println("Please enter the id 1-2-3 ");
			}
			
		}
	}
		
	public void menu() {
		System.out.println("Weapon Menu\n1-Gun\nid = 1\nProperties\n " + gun.getDamage() + "damage and " + gun.getMoney() + " dolars");
		System.out.println("2-Sword\nProperties\nid = 2\n " + sword.getDamage() + "damage and " + sword.getMoney() + " dolars");
		System.out.println("3-Gun\nProperties\nid = 3\n" + rifle.getDamage() + "damage and " + rifle.getMoney() + " dolars");
		System.out.println("Armor Menu\n1-Light Armor\nid = 1\nProperties\n "+ light.getBlock()+ " right to block and " + light.getMoney() + " dolars");
		System.out.println("2-Light Armor\nid = 2\nProperties\n "+ medium.getBlock()+ " right to block and " + medium.getMoney() + " dolars");
		System.out.println("3-Light Armor\nid = 3\nProperties\n "+ heavy.getBlock()+ " right to block and " + heavy.getMoney() + " dolars");
	}

}
