package Threads;

public class ThreadInator extends Thread {
	private int NUMBEROFTHREAD = 0;
	
	public ThreadInator(int NUMBEROFTHREAD){
		this.NUMBEROFTHREAD = NUMBEROFTHREAD;
	}
	
	@Override
	public void run() {
		if(NUMBEROFTHREAD > 0) {
			ThreadInator thread = new ThreadInator(NUMBEROFTHREAD - 1);
			System.out.println(getName());
			thread.start();
		}
	}
}
