package com.hp.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo5 {
	public static void main(String[] args) throws Exception {
		// ʹ���ļ��ֽ���������������ı������
		FileOutputStream fos = null;
		
		fos = new FileOutputStream("d:/test.txt",true);
		
		//fos.write(106);
		
		byte[] b = {97,98,99};
		fos.write(b);
		
		
		
		
		
	}
}
