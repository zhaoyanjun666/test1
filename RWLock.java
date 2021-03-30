package com.hp.bean;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLock {
	private int num = 0;
	
	private ReadWriteLock rwLock = new ReentrantReadWriteLock();
	
	
	
	// ��
	public void get() {
		rwLock.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName()+num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			// ���ձ�֤�ͷ���
			rwLock.readLock().unlock();
			
		}

		
	}

	// д
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
