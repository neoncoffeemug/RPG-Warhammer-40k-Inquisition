
public abstract class Creator {

	protected String name;
	protected double health;
	protected int power;
	protected int armor;
	
	protected Creator(String name, double health, int power, int armor) {
		
		this.name = name;
		this.health = health;
		this.power = power;
		this.armor = armor;
	}
	
	public String toString() {
		return this.name + '\n' + "Health: " + this.health + '\n' + "Power: " + power + '\n' + "Defense: " + armor;
	}

}
