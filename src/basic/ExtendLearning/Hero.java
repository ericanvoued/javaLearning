package basic.ExtendLearning;

public class Hero {
	
	int life;
	
	int magic;
	
	public void attack() {
		System.out.print("attack");
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public Hero() {
		super();
		
		System.out.print("hero\n");
		// TODO Auto-generated constructor stub
	}

}
