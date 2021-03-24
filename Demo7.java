package com.hp.demo;

public class Demo7 {
	public static void main(String[] args) {
		// 2. 关系运算符(比较运算符) : == 、> 、< 、 >= 、 <=
		int a = 10;
		int b = 11;
		int c = 23;
		int d = 22;
		boolean result = a > b;
		System.out.println(result);

		result = a + b > c + d;
		System.out.println(result);
	}
}
