
public class ChaosMarine extends Creator {

	protected ChaosMarine(String name, double health, int power, int armor) {
		super(name, health, power, armor);
	}
	
	public String toString() {
		return super.toString();
	}
	
	protected static void chaosBash(ChaosMarine chaosMarine, Marine ultraMarine){
		System.out.println(chaosMarine.name + " dashes at his target!" + '\n'
	    + chaosMarine.name + " bashes " + ultraMarine.name + " for: " + (ultraMarine.health = (ultraMarine.armor - chaosMarine.power)) + " damage");
		
	}
	
	 protected double Analyze(Marine ultraMarine, ChaosMarine chaosMarine) {
			int redução;
			redução = (chaosMarine.armor/2) - (ultraMarine.armor);
			return redução;
		 }

	@Override
	public void heal() {
		System.out.println("Target heals");
		
	}

}
