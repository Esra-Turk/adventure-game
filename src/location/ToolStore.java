package location;
import player.*;
import armor.*;
import weapon.*;
import java.util.*;

public class ToolStore extends NormalLocation {
	public int id;
	public String type;
	public String product;
	private Scanner input = new Scanner(System.in);

	public ToolStore(Player player, String name) {
		super(player, name);
	}

	@Override
	public boolean onLocation() {
		selectProduct();
		return true;
	}

	public void menuWeapon() {
		System.out.println("------------------------------- WEAPONS -------------------------------");
		Weapon[] weaponList = {new Gun(), new Sword(), new Rifle()};
		for (Weapon weapons : weaponList) {
			System.out.println("id:" + weapons.getId() +
					"\t Name: " + weapons.getName() +
					"\t Damage: " + weapons.getDamage() +
					"\t Money: " + weapons.getMoney());
		}
		System.out.println("-----------------------------------------------------------------------");
	}

	public void menuArmor() {
		System.out.println("------------------------------- ARMORS -------------------------------");
		Armor[] armorList = {new Light(), new Medium(), new Heavy()};
		for (Armor armors : armorList) {
			System.out.println("id: " + armors.getId() +
					"\t Name: " + armors.getName() +
					"\t Defense: " + armors.getBlock() +
					"\t Money: " + armors.getMoney());
		}
		System.out.println("----------------------------------------------------------------------");
	}

	public void buyWeapon (Weapon weapon) {
		System.out.println("Your money: " + this.player.getMoney());
		if(this.player.getMoney() >= weapon.getMoney()) {
			this.player.getInventory().setWeaponDamage(weapon.getDamage());
			this.player.getInventory().setWeaponName(weapon.getName());
			this.player.setDamage(this.player.getDamage() + weapon.getDamage());
			this.player.setMoney(this.player.getMoney() - weapon.getMoney());
			System.out.println("You bought the product. Your current money are " + this.player.getMoney());
			System.out.println("Your weapon is " + this.player.getInventory().getWeaponName() +
					" You have " + this.player.getDamage() + " damage anymore");
		}
		else {
			System.out.println("You dont have enough money");
		}

	}
	public void buyArmor(Armor armor) {
		System.out.println("Your money: " + this.player.getMoney());
		if(this.player.getMoney() >= armor.getMoney()) {
			this.player.getInventory().setArmorName(armor.getName());
			this.player.getInventory().setArmorDefence(armor.getBlock());
			this.player.setMoney(this.player.getMoney() - armor.getMoney());
			System.out.println("You bought the product. Your current money are " + this.player.getMoney());
			System.out.println("You have a " + this.player.getInventory().getArmorName() +
					" armor and "+ this.player.getInventory().getArmorDefence() + " defence ");
		}
		else {
			System.out.println("You dont have enough money");
		}
	}

	public void selectProduct () {
		System.out.print("Which product do you want to buy? Weapon or Armor: ");
		product = input.next();
		switch (product) {
			case "Weapon" -> {
				menuWeapon();
				System.out.print("Enter the weapon id that you want to buy:");
				id = input.nextInt();
				if (id == 1) {
					buyWeapon(new Gun());
				} else if (id == 2) {
					buyWeapon((new Sword()));
				} else if (id == 3) {
					buyWeapon((new Rifle()));
				} else {
					System.out.println("Invalid weapon id");
				}
			}
			case "Armor" -> {
				menuArmor();
				System.out.print("Enter the armor id that you want to buy:");
				id = input.nextInt();
				if (id == 1) {
					buyArmor(new Light());
				} else if (id == 2) {
					buyArmor((new Medium()));
				} else if (id == 3) {
					buyArmor((new Heavy()));
				} else {
					System.out.println("Invalid armor id!");
				}
			}
		}

	}
}


