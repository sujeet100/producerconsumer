package com.thread;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

	Queue<Integer> queue = new LinkedList<Integer>();
	public static final int MAX_QUEUE_SIZE = 4;

	public synchronized void put(int number) throws InterruptedException {
		System.out.println(queue);
		if (queue.size() == MAX_QUEUE_SIZE) {
			System.out.println("Producer waiting....");
			wait();
		} else {

			System.out.println("Adding: " + number);
			queue.add(number);
			notify();
		}
	}

	synchronized public void get() throws InterruptedException {
		System.out.println(queue);
		if (queue.size() == 0) {
			System.out.println("Consumer waiting...");
			wait();
		} else {

			System.out.println("Consuming...");
			queue.remove();
			notify();
		}
	}

}
