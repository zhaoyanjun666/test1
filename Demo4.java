package com.hp.demo;

import com.hp.bean.TestAccount;

public class Demo4 {
	public static void main(String[] args) {
		TestAccount account = new TestAccount();
		Thread t1 = new Thread(account);
		t1.setName("±¦Ç¿");
		t1.start();
		
		Thread t2 = new Thread(account);
		t2.setName("ÂíÈØ");
		t2.start();
		
		
		
		
		
	}
}
