package com.hp.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) {
		// ������
		BufferedReader reader = null;
		FileReader fr =  null;
		try {
			// �����ַ�������
			fr = new FileReader("d:/test.txt");
			// ������ͨ���ļ����������������л��������ļ�������
			reader = new BufferedReader(fr);
			// ��ȡ��ǰ�ļ��ڵ��������֣��������ַ���
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
