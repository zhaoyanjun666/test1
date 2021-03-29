package com.hp.bean;
/**
 * 1.定义一个类继承Thread类
 * 2.重写run方法
 * 3.创建子类对象
 * 4.调用start方法
 * @author Administrator
 *
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// 获取当前线程的名称
			String name = Thread.currentThread().getName();
			System.out.println("第"+i+"次执行"+name);
			
		}
	}
	
	
	

}
