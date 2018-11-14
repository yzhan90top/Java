package ThreadPractice;

class Thread2 implements Runnable{
	private String name;
	
	public Thread2(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(name+"ÔËÐÐ:"+i);
			try {
				Thread.sleep((int)Math.random()*10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableThread{
	
	public static void main(String[] args) {
	Thread t=	new Thread(new Thread2("A"));
	t.setPriority(Thread.MAX_PRIORITY);
	t.start();
		new Thread(new Thread2("B")).start();
		
	}
	
}
