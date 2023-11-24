package WriteThreadSNames;

import Threads.ReverseThreadInator;
import Threads.ThreadInator;

public class Main {
	public static void main(String[] args) {
		//startThreads(3);
		startReverseThreads(3);
	}
	
	public static void startThreads(int howManyThreads) {
		new ThreadInator(howManyThreads).start();
	}
	public static void startReverseThreads(int howManyThreads) {
		new ReverseThreadInator(howManyThreads).start();
	}
}