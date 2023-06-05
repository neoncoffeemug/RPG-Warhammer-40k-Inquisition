
public class Marine extends Creator {

	public Marine(String name, double health, int power, int armor) {
		super(name, health, power, armor);
	}
	
	public String toString() {
		return super.toString();
	}
	
	 protected static void powerSword(Marine ultraMarine, ChaosMarine chaosMarine, Necron necronWarrior) {
		System.out.println(ultraMarine.name + " attacks: " + chaosMarine.name + " for: " + (chaosMarine.health = (chaosMarine.armor - ultraMarine.power)) + " damage");
	}

	
		
}