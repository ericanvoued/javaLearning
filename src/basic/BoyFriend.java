package basic;

public class BoyFriend {
	
	public static String name="xiaoming";
	
	public static int height=180;
	
	public static int weight=140;
	
	public static int salary=20000;
	
	/**
	 * 函数构造、构造方法 默认是有无参的构造方法
	 */
	BoyFriend() {
		
	}
	
	public void goTrip() {
		System.out.print("男朋友带我去旅行～" + "\n");
	}
	
	/**
	 * 类中变量属性赋值 get、set方法
	 * 函数的书写
	 * 访问修饰符 返回值 函数名称 （参数）
	 * void表示无返回值
	 * @return
	 */
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		BoyFriend.name = name;
	}

	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		BoyFriend.height = height;
	}

	public static int getWeight() {
		return weight;
	}

	public static void setWeight(int weight) {
		BoyFriend.weight = weight;
	}

	public static int getSalary() {
		return salary;
	}

	public static void setSalary(int salary) {
		BoyFriend.salary = salary;
	}
	
}
