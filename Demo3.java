package com.hp.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		// ��ȡ�ı��ļ�
		// 1. ������Ҫ��ȡ���ļ�
		File file = new File("d:/test.txt");
		FileInputStream fis = null;
		
		try {
			// 2.�������ڶ�ȡ�����룩ָ���ļ���FileInputStream���ļ���������
			fis = new FileInputStream(file);
			
			// 3.��ȡ��ǰ������ȡ���ļ����ֽڳ���
			int byteLength = fis.available();
			System.out.println(byteLength);
			
			// ����read������������ÿһ�ζ�ȡ���ֽڣ���ȡ��ĩβ������-1
			/*int  data = -1;
			
			while ((data=fis.read())!=-1) {
				System.out.println(data);
				
			}*/
			// һ���Զ�ȡ�ֽ����ݵ�ָ���ֽ�����
			byte[] b = new byte[fis.available()];
			// ͨ��read����һ���Զ�ȡ
			fis.read(b);
			System.out.println(Arrays.toString(b));
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				// ����������
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fis = null;
			}
			
		}
		
		
		
	}
}
