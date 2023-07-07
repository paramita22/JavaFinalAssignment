package com.java.param1;

import java.util.ArrayDeque;

import java.util.Arrays;
import java.util.Queue;
import java.util.Random;

//producer thread operations
class Producer extends Thread {

	// Producer producing the data in StringBuffer
	StringBuffer sb;

	public Producer() {
		// StringBuffer object is created with a default capacity 16
		sb = new StringBuffer();
	}

	public void run(Queue<Integer> Q)throws IllegalStateException {
		synchronized (sb) {
			
			for(int i=0;i<10;i++) {
				Random num1=new Random();
				System.out.println(num1);
				Integer num=(int) Math.random();
				System.out.println(num);
				Q.add(num);
			}
			// send the notification to the waiting thread
			System.out.println(Q);
			System.out.println("Producer thread is executing");
			sb.notify();
		}

	}

}

//Consumer thread operations
class Consumer extends Thread {

	// Creating producer object to get the produced data from StringBuffer
	Producer producer;

	// injecting the Producer Object into Consumer
	public Consumer(Producer producer) {
		this.producer = producer;
	}

	@SuppressWarnings("unchecked")
	public void run(Queue<Integer> Q){
		double sum=0;
		synchronized (producer.sb) {
			
			try {
				
				//wait till the notification is sent by producer
				producer.sb.wait(100);
				
				// consume the data produced by the producer
				System.out.println("Consumer thread is executing");
				System.out.println(producer.sb);
					while(producer.sb!=null) {
					int n=(int) Q.element();
					sum+=n;
					}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The sum is = "+sum);
		}
	}
}

//Effecient way of interthread communication  using wait() and notify()
public class ProducerConsumerCommunication {

	//Driving code where he start the other thread
	public static void main(String[] args) {
		
		Queue<Integer> Q=new ArrayDeque<Integer>();
		Producer obj1 = new Producer();
		obj1.run(Q);
		Consumer obj2 = new Consumer(obj1);
		obj2.run(Q);

		Thread t1 = new Thread(obj1);// producer thread
		Thread t2 = new Thread(obj2);// consumer thread

		t2.start();// consumer should wait
		t1.start();// producer should start
	}
}
