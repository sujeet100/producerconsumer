package com.thread;

public class BlockingQueueTest {

	public static void main(String[] args) {
		
		BlockingQueue queue=new BlockingQueue();
		
		
		Producer producer=new Producer(queue);
		Consumer consumer=new Consumer(queue);
		
		Thread prodThread=new Thread(producer);
		Thread consumerThread=new Thread(consumer);
		
		prodThread.start();
		consumerThread.start();
		
		
	}
	
	
}
