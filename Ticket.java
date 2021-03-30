package com.hp.bean;

public class Ticket implements Runnable{
	// 剩余票数
	int  ticket = 100;
	
	// 定义锁对象
	byte[] lock = new byte[0];
	@Override
	public void run() {
		// 模拟卖票
		while(true){
			/*synchronized(this){
				if(ticket>0){
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					System.out.println(Thread.currentThread().getName()+"正在售卖"+ticket--);
					
				}
				
			}*/
			// 同步方法
			function();
			
			
			
		}
		
	}

	public synchronized void function(){
		if(ticket>0){
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			System.out.println(Thread.currentThread().getName()+"正在售卖"+ticket--);
			
		}
		
		
	}

	public synchronized static void methodA(){
		
		
		
	}
	
	
	public void methodB(){
		
		
		
	}
}
