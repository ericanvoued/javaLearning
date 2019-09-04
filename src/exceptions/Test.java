package exceptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 使用try catch捕获一场 捕获之后 程序继续运行 不会报错
		 */
//		try {
//			
//			System.out.print(1/1);
//		} catch(Exception e){
//			
//			System.out.print(e.getMessage());
//		}
		ZooKeeper zooKeeper = new ZooKeeper();
		
		try {
			zooKeeper.feedAnimal(200);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}

	}

}
