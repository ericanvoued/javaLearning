package exceptions;

public class MyException extends Exception {
	
	/**
	 * 重写异常
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
//		return super.getMessage();
		return "this is my exception";
	}
	
	
	
}
