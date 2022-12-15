package inventory;

public class Inventory {
	private boolean water;
	private  boolean food;
	private boolean freewoord;
	private String armorName;
	private  int weaponDamage;
	private int armorDefence;
	
	public boolean isWater() {
		return water;
	}
	public void setWater(boolean water) {
		this.water = water;
	}
	public boolean isFood() {
		return food;
	}
	public void setFood(boolean food) {
		this.food = food;
	}
	public boolean isFreewoord() {
		return freewoord;
	}
	public void setFreewoord(boolean freewoord) {
		this.freewoord = freewoord;
	}
	public String getArmorName() {
		return armorName;
	}
	public void setArmorName(String armorName) {
		this.armorName = armorName;
	}
	public int getWeaponDamage() {
		return weaponDamage;
	}
	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	public int getArmorDefence() {
		return armorDefence;
	}
	public void setArmorDefence(int armorDefence) {
		this.armorDefence = armorDefence;
	}
}
