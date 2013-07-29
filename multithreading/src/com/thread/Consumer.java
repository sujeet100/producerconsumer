package com.thread;

public class Consumer implements Runnable {

	BlockingQueue blockingQueue;

	int i = 0;

	public Consumer(BlockingQueue queue) {
		this.blockingQueue = queue;
	}

	public void consume() {

		try {
			blockingQueue.get();
			;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				//change this sleep time to less than that of producer to generate case of consumer waiting
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			consume();
		}
	}
}
