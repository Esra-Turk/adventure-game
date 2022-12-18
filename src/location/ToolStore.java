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

	public ToolStore(Player player, String name) {
		super(player, name);
		menu();
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
		
//	public void buy() {		
//		if(type == "armor" && player.getWallet() > light.getMoney()) {
//			switch(id) {
//			case 1:
//				double money = player.getWallet() - player.inventory..getMoney();
//				System.out.println("You bought the light armor. Count of armor is "+ inv.getCountArmor()+ "\nYou have " + money + " dolars anymore.");
//				break; 
//			
//			case 2:
//				double money2 = player.getWallet() - medium.getMoney();
//				player.setWallet(money2);
//				inv.setCountArmor(inv.getCountArmor() + 1);
//				System.out.println("You bought the medium armor. Count of armor is "+ inv.getCountArmor()+ "\nYou have " + money2 + " dolars anymore.");
//			
//			
//			case 3:
//				double money3 = player.getWallet() - heavy.getMoney();
//				player.setWallet(money3);
//				inv.setCountArmor(inv.getCountArmor() + 1);
//				System.out.println("You bought the heavy armor. Count of armor is"+ inv.getCountArmor()+ "\nYou have " + money3 + " dolars anymore.");
//				break;
//				
//			default:
//				System.out.println("Please enter the id 1-2-3 ");
//			}
//		}
//		
//		if(type == "weapon" && player.getWallet() > light.getMoney()) {
//			switch(id) {
//			case 1:
//				double money = player.getWallet() - gun.getMoney();
//				player.setWallet(money);
//				inv.setCountArmor(inv.getCountArmor()+1);
//				System.out.println("You bought the light armor. Count of armor is "+ inv.getCountArmor()+ "\nYou have " + money + " dolars anymore.");
//				break;
//			case 2:
//				double money2 = player.getWallet() - medium.getMoney();
//				player.setWallet(money2);
//				inv.setCountArmor(inv.getCountArmor() + 1);
//				System.out.println("You bought the medium armor. Count of armor is "+ inv.getCountArmor()+ "\nYou have " + money2 + " dolars anymore.");
//				break;
//				
//			case 3:
//				double money3 = player.getWallet() - heavy.getMoney();
//				player.setWallet(money3);
//				inv.setCountArmor(inv.getCountArmor() + 1);
//				System.out.println("You bought the heavy armor. Count of armor is"+ inv.getCountArmor()+ "\nYou have " + money3 + " dolars anymore.");
//	 			break;
//	 		default:
//				System.out.println("Please enter the id 1-2-3 ");
//			}
//			
//		}
//	}
		
	public void menu() {
		System.out.println("MENU\n1-water\n2-");
	}

}
