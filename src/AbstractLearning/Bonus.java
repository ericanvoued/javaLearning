package AbstractLearning;

/**
 * 使用abstract定义抽象类
 * 	抽象  向用户展示了重要的事情，并隐藏内部详细信息
 * 子类继承父类非私有的属性和方法  继承之后要对里面的方法进行实现
 * 声明的abstract抽象类不能够实例化，让子类实现
 * @author ericchen
 *
 */

public abstract class Bonus {
	
	public String location;
	
	private int money;
	
	abstract void getMoney();

}
