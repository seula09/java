package test.three;

public class Attacker extends AbstractMoster{
	
	protected Attacker() {
		super("attacker", 30, 20, 10);
	}
	
	@Override
	public int attack() {
		System.out.println("Attacker-Very Strong Attack");
		return attack;
	}

}
