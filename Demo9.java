package com.hp.demo;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		// 获取键盘输入对象
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数字");
		// 获取int类型的输入
		int num = input.nextInt();
		System.out.println(num);
		
		System.out.println("请输入姓名");
		String name = input.next();
		
		
		System.out.println(name);
		
		
		
		
	}
	
}
