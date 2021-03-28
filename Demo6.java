package com.hp.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) {
		// 缓冲流
		BufferedReader reader = null;
		FileReader fr =  null;
		try {
			// 创建字符输入流
			fr = new FileReader("d:/test.txt");
			// 传入普通的文件输入流，创建带有缓冲区的文件输入流
			reader = new BufferedReader(fr);
			// 读取当前文件内的所有文字，保存至字符串
			String string = reader.readLine();
			System.out.println(string);
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fr = null;
				
			}
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				reader=null;
			}
		}
		
		
		
		
		
		
		
	}
}
