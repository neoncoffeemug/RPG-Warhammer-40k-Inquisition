
public class Necron extends Creator {

	public Necron(String name, double health, int power, int defense) {
		super(name, health, power, defense);
	}
	
	public String toString() {
		return super.toString();
	}
	
	protected String gaussFlayer() {
		// = "Space Marine";
		return (name+" shoots it's target")  +'\n'
		+ this.name + " attacks " + this.name + " for: " + (this.health = (this.armor - this.power);
	}
	
	

}
