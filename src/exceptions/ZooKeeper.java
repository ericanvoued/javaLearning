package exceptions;

public class ZooKeeper {
	
	public void feedAnimal(int foodMount) throws MyException {
		
		switch(foodMount) {
		
		case 100: 
			System.out.print("haha,good");
			
			break;
		case 200:
			throw new MyException();
			
//			break;
		}
		
		
	}
}
