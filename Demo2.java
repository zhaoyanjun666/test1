package com.hp.demo;

import com.hp.bean.MyThread;

public class Demo2 {
	public static void main(String[] args) {
	/*	Thread thread = new Thread();
		thread.start();
		*/
		
		System.out.println(Thread.currentThread().getName()+"开始");
		MyThread mt1 = new MyThread();
		mt1.setName("王宝强");
		mt1.start();
		MyThread mt2 = new MyThread();
		mt2.setName("马蓉");
		mt2.start();
		MyThread mt3 = new MyThread();
		mt3.setName("宋喆");
		mt3.start();
		
		System.out.println(Thread.currentThread().getName()+"结束");
		
	}
}
