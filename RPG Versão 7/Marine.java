
public class Marine extends Creator {
	
	private Itens bolter;
	public void ligue (Itens Marine) {
		bolter = Marine;
	}
		
	public Marine(String name, double health, int power, int armor) {
		super(name, health, power, armor);
	}
	
	public String toString() {
		return super.toString();
	}
	
	 protected static void powerSword(Marine ultraMarine, ChaosMarine chaosMarine, Necron necronWarrior) {
		System.out.println(ultraMarine.name + " attacks: " + chaosMarine.name + " for: " + (chaosMarine.health = (chaosMarine.armor - ultraMarine.power)) + " damage");
	}
	 
	 protected double Analyze(Marine ultraMarine, ChaosMarine chaosMarine) {
		double reducao;
		reducao = (ultraMarine.health/2) - chaosMarine.armor;
		System.out.println(reducao);
		return reducao;
	 }
	 
	@Override
	public void heal() {
		System.out.println("Target heals");
	}
	
}