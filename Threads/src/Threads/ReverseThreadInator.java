package Threads;

public class ReverseThreadInator extends Thread{
private int NUMBEROFTHREAD = 0;
	
	public ReverseThreadInator(int NUMBEROFTHREAD){
		this.NUMBEROFTHREAD = NUMBEROFTHREAD;
	}
	
	@Override
	public void run() {
		if(NUMBEROFTHREAD > 0) {
			ReverseThreadInator thread = new ReverseThreadInator(NUMBEROFTHREAD - 1);
			thread.start();
			try {
				thread.join();
			}catch(InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println(getName());
		}
	}
}
