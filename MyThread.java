package com.hp.bean;
/**
 * 1.����һ����̳�Thread��
 * 2.��дrun����
 * 3.�����������
 * 4.����start����
 * @author Administrator
 *
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			// ��ȡ��ǰ�̵߳�����
			String name = Thread.currentThread().getName();
			System.out.println("��"+i+"��ִ��"+name);
			
		}
	}
	
	
	

}
