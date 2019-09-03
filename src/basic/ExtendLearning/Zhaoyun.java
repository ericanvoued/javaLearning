package basic.ExtendLearning;

public class Zhaoyun extends Hero{
	
	/**
	 * this 表示当前对象 或者方法
	 * 
	 * super 表示父类
	 * 
	 */
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		/**
		 * 先打印父类的 
		 */
		super.attack();
		
		System.out.print("..................."); //attack ...............
	}

	public Zhaoyun() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.print("zhaoyun\n");
	}
	
//	public void attack() {
//		System.out.print("..................."); 
//	}


}
