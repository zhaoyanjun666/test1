package com.hp.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo9 {
	public static void main(String[] args) throws Exception {
		// ���϶���Properties�࣬ �̳�HashTable��ʵ����Map�ӿ�,���io��ʹ��
		Properties pro = new Properties();
		pro.setProperty("name", "����");
		pro.setProperty("age", "31");
		pro.setProperty("email", "�彧��@qq.com");
		
		
		
		FileWriter fw = new FileWriter("d:/pro.properties");
		
		
		pro.store(fw, "");
		
		fw.close();
		
		
		
		
	}
}
