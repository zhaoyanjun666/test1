package com.hp.bean;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// 获取当前线程的名称
			String name = Thread.currentThread().getName();
			System.out.println("第"+i+"次执行"+name);
			if(i==0){
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}
