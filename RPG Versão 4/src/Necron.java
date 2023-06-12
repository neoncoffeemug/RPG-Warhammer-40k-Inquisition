
public class Necron extends Creator {

	public Necron(String name, double health, int power, int defense) {
		super(name, health, power, defense);
	}
	
	public String toString() {
		return super.toString();
	}
	
	protected static void gausFlayer(Necron necronWarrior, Marine ultraMarine) {
		System.out.println(necronWarrior.name + " charges it's laser!" + '\n'
				+ necronWarrior.name + " fires at: " + ultraMarine.name + "for: " + (ultraMarine.health = (ultraMarine.armor - necronWarrior.power)));
	}
	
	

}
