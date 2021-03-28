package com.hp.demo;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		// 创建file类型对象
		File file1 = new  File("d:/test.txt");// 不存在的文件
		File file2 = new  File("d:/workspace");// 已存在的文件
		File file3 = new  File("d:/sssss");// 不存在的目录
		// 传递完整路径
		File file4 = new File("D:\\aaa\\a.jpg");
		// 父路径为文件
		File file5 = new File("D:\\aaa");
		// 父路径对象加自路径
		File file6 = new File(file5, "a.jpg");
		
		// 判断当前文件是否存在
		/*System.out.println(file1.exists());
		System.out.println(file2.exists());*/
		// 获取当前文件的绝对路径
		System.out.println(file2.getAbsolutePath());
		
		// 获取当前文件名称
		System.out.println(file2.getName());
		// 获取当前文件的父路径
		System.out.println(file6.getParent());
		// 删除当前文件
		
		boolean delete = file1.delete();
		System.out.println(delete);
		System.out.println(file1.exists());
		
		// 创建文件
		try {
			boolean b = file1.createNewFile();
			System.out.println(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 创建目录
		file3.mkdir();
		
		
		// 判断是否是目录
		boolean b = file2.isDirectory();
		System.out.println(b);
		
		// 创建级联目录
		File file7 = new File("d:/fff/dd/cc");
		file7.mkdirs();
		
		// 获取系统中的所有目录
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
