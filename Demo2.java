package com.hp.demo;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		// ����file���Ͷ���
		File file1 = new  File("d:/test.txt");// �����ڵ��ļ�
		File file2 = new  File("d:/workspace");// �Ѵ��ڵ��ļ�
		File file3 = new  File("d:/sssss");// �����ڵ�Ŀ¼
		// ��������·��
		File file4 = new File("D:\\aaa\\a.jpg");
		// ��·��Ϊ�ļ�
		File file5 = new File("D:\\aaa");
		// ��·���������·��
		File file6 = new File(file5, "a.jpg");
		
		// �жϵ�ǰ�ļ��Ƿ����
		/*System.out.println(file1.exists());
		System.out.println(file2.exists());*/
		// ��ȡ��ǰ�ļ��ľ���·��
		System.out.println(file2.getAbsolutePath());
		
		// ��ȡ��ǰ�ļ�����
		System.out.println(file2.getName());
		// ��ȡ��ǰ�ļ��ĸ�·��
		System.out.println(file6.getParent());
		// ɾ����ǰ�ļ�
		
		boolean delete = file1.delete();
		System.out.println(delete);
		System.out.println(file1.exists());
		
		// �����ļ�
		try {
			boolean b = file1.createNewFile();
			System.out.println(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ����Ŀ¼
		file3.mkdir();
		
		
		// �ж��Ƿ���Ŀ¼
		boolean b = file2.isDirectory();
		System.out.println(b);
		
		// ��������Ŀ¼
		File file7 = new File("d:/fff/dd/cc");
		file7.mkdirs();
		
		// ��ȡϵͳ�е�����Ŀ¼
		File[] listRoots = File.listRoots();
		System.out.println(Arrays.toString(listRoots));
		
		
		
		File file8 = new File("d:/fff");
		String[] list = file8.list();
		System.out.println(Arrays.toString(list));
		
		try {
			File[] list1 = file8.listFiles();
			System.out.println(Arrays.toString(list1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File[] files = file5.listFiles(new Myfilter());
		System.out.println(Arrays.toString(files));
		
	}

}
