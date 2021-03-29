package com.hp.bean;

public class TestAccount implements Runnable {
	private Account account =  new Account();

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"开始取钱~~~~~~~");
			
			withDraw(100);
		}
		
		

	}
	
	public void withDraw(int money){
		// 同步代码块
		synchronized(account){
			if(money<=account.getBlance()){
				// 取款
				account.withDraw(money);
				// 显示取款后的余额
				System.out.println(Thread.currentThread().getName()+"的余额"+account.getBlance());
				
			}else{
				System.out.println("余额不足");
			}
			
		}
		
	}
	

}
