package basic;

public class TestBoyFriend {
	
	public static void main(String[] args) {
		
		BoyFriend friendA = new BoyFriend();
		
		friendA.setWeight(200);
		friendA.setName("xiaoqiang");
		friendA.setSalary(30000);
		
		friendA.goTrip();
		
		System.out.print("height is " + friendA.height + "\n");
		System.out.print("name is " + friendA.name + "\n");
		System.out.print("salary is " + friendA.salary + "\n");
		System.out.print("weight is " + friendA.weight + "\n");
	}
	
}
