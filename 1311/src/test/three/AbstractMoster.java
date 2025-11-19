package test.three;

public abstract class AbstractMoster {
	
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	
	
	
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	protected AbstractMoster(String name, int hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	public boolean defense(int attack) {
		if(defense > attack) {
			return true;
		}else{
			defense -= attack;
			hp -= attack;
			return false;
		}
		
	}
	
	public abstract int attack();

}
