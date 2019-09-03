package basic.ExtendLearning;

public class Game {
	
	public String name;
	
	public String agent;
	
	public void play() {
		System.out.print("name is " + this.name + ", agent is " + this.agent);
	}

	public Game(String name, String agent) {
		super();
		this.name = name;
		this.agent = agent;
	}
}
