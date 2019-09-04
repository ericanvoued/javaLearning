package AbstractLearning;

/**
 * 使用abstract定义抽象类
 * 	抽象  向用户展示了重要的事情，并隐藏内部详细信息
 * @author ericchen
 *
 */

public abstract class Bonus {
	
	public String location;
	
	private int money;
	
	abstract void getMoney();

}
