package com.hp.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		// 使用文件输入流读取图片
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("d:/aaaa.jpg");
			byte[] dataArray = new byte[fis.available()];
			fis.read(dataArray);
			System.out.println(Arrays.toString(dataArray));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fis = null;
			}
		}
		
		
	}
	// 做图片的复制
}
