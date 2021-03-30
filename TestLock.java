package com.hp.bean;

import java.util.Random;

public class TestLock  implements Runnable{

	int num = new Random().nextInt(1);
	
	
	@Override
	public void run() {
		while(true){
			if(num%2==0){
				synchronized (MyLock.lockA) {
					System.out.println(Thread.currentThread().getName()+"����A");
					
					synchronized (MyLock.lockB) {
						System.out.println(Thread.currentThread().getName()+"����B");
						
						
					}
				}
				
			}else{
				synchronized (MyLock.lockB) {
					System.out.println(Thread.currentThread().getName()+"����B");
					
					synchronized (MyLock.lockA) {
						System.out.println(Thread.currentThread().getName()+"����A");
						
						
					}
				}
			}
			num++;
			
		}
		
	}

}
