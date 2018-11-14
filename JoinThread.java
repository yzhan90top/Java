package ThreadPractice;

class Thread1 extends Thread{
	
	public Thread1(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(this.getName()+"线程开始运行");
		for(int i=0;i<5;i++) {
			System.out.println("子线程"+this.getName()+"运行："+i);
		try {
			sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println(Thread.currentThread().getName()+"线程结束");
	}	
}

public class JoinThread{
	public static void main(String args[]) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+"主线程开始");
		Thread1 t=new Thread1("C");
		Thread1 t1= new Thread1("D");
		t.start();
		t1.start();
		t.join();
		t1.join();
		System.out.println(Thread.currentThread().getName()+"主线程结束");
	}
}