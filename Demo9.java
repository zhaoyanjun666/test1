package com.hp.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo9 {
	public static void main(String[] args) throws Exception {
		// 集合对象Properties类， 继承HashTable，实现了Map接口,结合io流使用
		Properties pro = new Properties();
		pro.setProperty("name", "西门");
		pro.setProperty("age", "31");
		pro.setProperty("email", "清涧县@qq.com");
		
		
		
		FileWriter fw = new FileWriter("d:/pro.properties");
		
		
		pro.store(fw, "");
		
		fw.close();
		
		
		
		
	}
}
