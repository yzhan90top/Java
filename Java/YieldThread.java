package ThreadPractice;

class Thread3 extends Thread{
	
	public Thread3(String name) {
		super(name);
		
	}
	public void run() {
	for(int i=1;i<=50;i++) {
		System.out.println(""+this.getName()+"----"+i);
		if(i==30) {
			this.yield();
		}
	}
	}
	}

public class YieldThread{
	
	public static void main(String args[]) {
		Thread3 t= new Thread3("C");
		Thread3 t1= new Thread3("D");
		t.start();
		t1.start();
	}
}