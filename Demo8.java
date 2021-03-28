package com.hp.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.hp.bean.Student;

public class Demo8 {
	public static void main(String[] args) throws Exception {
		
		Student stu = new Student("金莲", 18);
		
		// 对象流   序列化
		ObjectOutputStream oos = null;
		FileOutputStream fos = new FileOutputStream("d:/test.txt");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(stu);
		
		// 对象流的读取 反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/test.txt"));
		Student readObject = (Student)ois.readObject();
		System.out.println(readObject);
		
		
		
		
		
		
		
		
		
		
	}
}
