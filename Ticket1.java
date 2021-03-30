package com.hp.bean;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket1 implements Runnable{
	// 剩余票数
		int  ticket = 100;
		
		// 创建lock锁对象
		ReentrantLock rl = new ReentrantLock();
		@Override
		public void run() {
			// 模拟卖票
			while(true){
				// 上锁
				rl.lock();
					if(ticket>0){
						
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						System.out.println(Thread.currentThread().getName()+"正在售卖"+ticket--);
						
					}
					// 释放锁
					rl.unlock();
				}
				
				
				
				
		
			
		}


	
}
