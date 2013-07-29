package com.thread;

public class Producer implements Runnable {

	BlockingQueue blockingQueue;

	int i = 0;

	public Producer(BlockingQueue queue) {
		this.blockingQueue = queue;
	}

	public void generate() {

		try {
			blockingQueue.put(i++);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			generate();
		}
	}

}
