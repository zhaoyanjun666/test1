package com.hp.bean;

public class TestAccount implements Runnable {
	private Account account =  new Account();

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"��ʼȡǮ~~~~~~~");
			
			withDraw(100);
		}
		
		

	}
	
	public void withDraw(int money){
		// ͬ�������
		synchronized(account){
			if(money<=account.getBlance()){
				// ȡ��
				account.withDraw(money);
				// ��ʾȡ�������
				System.out.println(Thread.currentThread().getName()+"�����"+account.getBlance());
				
			}else{
				System.out.println("����");
			}
			
		}
		
	}
	

}
