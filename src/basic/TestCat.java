package basic;

public class TestCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat = new Cat();
		
		cat.sleep(10);
		
		
		/**
		 * instanceof 某个对象是某个类的实际例子 返回boolean
		 */
		if(cat instanceof Cat) {
			System.out.print("yes it is!");
		}
		
		/**
		 * 这个对象没有名字 --》 在Java中称为 匿名对象
		 * 简单来说 就是直接new出来的， 没有将new出来的结果 赋予某个值
		 * 还有一点 每次new出来的匿名对象都是新的对象
		 */
		(new Cat()).sleep(5);
	}

}
