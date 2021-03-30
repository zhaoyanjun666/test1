package com.hp.bean;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLock {
	private int num = 0;
	
	private ReadWriteLock rwLock = new ReentrantReadWriteLock();
	
	
	
	// 读
	public void get() {
		rwLock.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName()+num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			// 最终保证释放锁
			rwLock.readLock().unlock();
			
		}

		
	}

	// 写
	public void set(int num) {
		rwLock.writeLock().lock();
		try {
			this.num = num;
			System.out.println(Thread.currentThread().getName()+num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			rwLock.writeLock().unlock();
		}
	}
	
	
	

}
