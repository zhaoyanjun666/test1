package com.hp.bean;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket1 implements Runnable{
	// ʣ��Ʊ��
		int  ticket = 100;
		
		// ����lock������
		ReentrantLock rl = new ReentrantLock();
		@Override
		public void run() {
			// ģ����Ʊ
			while(true){
				// ����
				rl.lock();
					if(ticket>0){
						
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						System.out.println(Thread.currentThread().getName()+"��������"+ticket--);
						
					}
					// �ͷ���
					rl.unlock();
				}
				
				
				
				
		
			
		}


	
}
