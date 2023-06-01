
public class Char {
	
	String name;
	double health;
	int power;
	int armor;

	public Char(String name, double health, int power, int armor) {
		
		this.name = name;
		this.health = health;
		this.power = power;
		this.armor = armor;
	}
	

	public String toString() {
		return this.name + '\n' + "Health: " + this.health + '\n' + "Power: " + power + '\n' + "Defense: " + armor;
	}
}


