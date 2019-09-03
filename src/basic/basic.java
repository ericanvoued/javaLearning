package basic;

public class basic {
	/**
	*       1常量 一般final修饰， 大写
	*/

	public static final int DAY_OF_YEAR = 365;

	/**
	*       2 变量
	*/

	public static int time = 15;

	/**
	 *      3 数据类型
	 *      所有数据类型都有默认值
	 */
	
	public static byte num1; //默认是0
	public static short num2 = 1;
	public static int num3 = 1;
	public static long num4 = 1;
	public static char str = 'A'; //字符串类型是单引号 双引号是字符串
	public static boolean isTrue = false;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO auto-generated method stub
		time = 19;
		System.out.print(time+"\n");
		System.out.print(num1+"\n");
	}




	
	
}
