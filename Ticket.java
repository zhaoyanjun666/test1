package com.hp.bean;

public class Ticket implements Runnable{
	// ʣ��Ʊ��
	int  ticket = 100;
	
	// ����������
	byte[] lock = new byte[0];
	@Override
	public void run() {
		// ģ����Ʊ
		while(true){
			/*synchronized(this){
				if(ticket>0){
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					System.out.println(Thread.currentThread().getName()+"��������"+ticket--);
					
				}
				
			}*/
			// ͬ������
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
			
			
			System.out.println(Thread.currentThread().getName()+"��������"+ticket--);
			
		}
		
		
	}

	public synchronized static void methodA(){
		
		
		
	}
	
	
	public void methodB(){
		
		
		
	}
}
