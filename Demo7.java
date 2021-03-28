package com.hp.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo7 {
	public static void main(String[] args) throws IOException {
		// 字符输出
		String str = "空山新雨后，天气晚来秋";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		fw = new FileWriter("d:/test.txt");
		bw = new BufferedWriter(fw);
		// 将所要写入的字符串转换为字符数组，并通过普通的字符输入流进行操作
		//fw.write(str.toCharArray());
		// 使用缓冲流进行写入
		bw.write(str);
		// 刷新流
		bw.flush();
		
		
		
		// 文件的复制
		
		
		
	}
}
