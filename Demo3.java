package com.hp.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		// 读取文本文件
		// 1. 创建所要读取的文件
		File file = new File("d:/test.txt");
		FileInputStream fis = null;
		
		try {
			// 2.创建用于读取（输入）指定文件的FileInputStream（文件输入流）
			fis = new FileInputStream(file);
			
			// 3.获取当前流所读取的文件的字节长度
			int byteLength = fis.available();
			System.out.println(byteLength);
			
			// 调用read（）方法返回每一次读取的字节，读取到末尾，返回-1
			/*int  data = -1;
			
			while ((data=fis.read())!=-1) {
				System.out.println(data);
				
			}*/
			// 一次性读取字节数据到指定字节数组
			byte[] b = new byte[fis.available()];
			// 通过read方法一次性读取
			fis.read(b);
			System.out.println(Arrays.toString(b));
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				// 销毁输入流
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fis = null;
			}
			
		}
		
		
		
	}
}
