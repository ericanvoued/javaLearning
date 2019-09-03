package basic;

public class Cat {
	
	private String color;
	
	private String from;
	
	private String food;
	
	/**
	 * 我们这里没有写构造函数  因为Java的对象中默认会有一个构造函数
	 * 默认构造函数可以不写，Java对象中自带
	 */
	public Cat() {
		
	}
	
	/**
	 * 函数的重载 只关心参数列表 参数个数 参数类型
	 * 即使参数的意义不一样 但如果和某一个函数参数列表个数、类型相同 则报错
	 * 函数的重载除了重载构造函数之外，还可以重载普通方法
	 * @param color
	 * @param from
	 * @param food
	 */
	public Cat(String color, String from, String food) {
		super();
		this.color = color;
		this.from = from;
		this.food = food;
	}
	
	
	public void sleep(int hours) {
		System.out.print("this cat can sleep " + hours + " hours!");
	}
}
