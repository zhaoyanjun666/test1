package com.hp.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo7 {
	public static void main(String[] args) throws IOException {
		// �ַ����
		String str = "��ɽ���������������";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		fw = new FileWriter("d:/test.txt");
		bw = new BufferedWriter(fw);
		// ����Ҫд����ַ���ת��Ϊ�ַ����飬��ͨ����ͨ���ַ����������в���
		//fw.write(str.toCharArray());
		// ʹ�û���������д��
		bw.write(str);
		// ˢ����
		bw.flush();
		
		
		
		// �ļ��ĸ���
		
		
		
	}
}
