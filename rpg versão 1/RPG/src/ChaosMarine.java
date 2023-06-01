
public class ChaosMarine extends Creator {

	protected ChaosMarine(String name, double health, int power, int armor) {
		super(name, health, power, armor);
	}
	
	public String toString() {
		return super.toString();
	}
	
	protected String chaosBash() {
		System.out.println(this.name + " dashes at his target!");
		return this.name + " bashes " + name + " for: " + (this.health - this.armor);
	}

	protected static void chaosBash(ChaosMarine chaosMarine, Marine ultraMarine){
		System.out.println(chaosMarine.name + " dashes at his target!" + '\n'
	    + chaosMarine.name + " bashes " + ultraMarine.name + " for: " + (ultraMarine.health = (ultraMarine.armor - chaosMarine.power)) + " damage");
		
	}

}
