package com.hp.demo;

import com.hp.bean.MyThread2;

public class Demo3 {
	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2();
		Thread t1 = new Thread(mt1);
		t1.start();
		
		
		Thread t2 = new Thread(mt1);
		t2.start();
		
		/*new Thread(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}
			
			
			
			
		}.start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();*/
		
	}
}
