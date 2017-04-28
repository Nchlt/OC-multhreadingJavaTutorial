package sandbox;

public class TestProcessusThread {
	public static Integer entier = 0;
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Test());
		Thread t2 = new Thread(new Test());
		Thread t3 = new Thread(new Test());
		Thread t4 = new Thread(new Test());
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}	
		
}
