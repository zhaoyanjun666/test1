package com.hp.demo;

public class Demo5 {
	 public static void main(String[] args) {
		double i = 5.0+5.0*9.2+4.0+'a';
		
		int  a = 10;
		double d = 23.33;
		
		// 自动类型转换
		/*d = a;
		System.out.println(d);*/
		
		
		// 强制类型转换
		a = (int)d;
		System.out.println(a);
		
		int s = 128;
		byte b = 12;
		b = (byte)s;
		System.out.println(b);
		
		
		
		
		
	}
}
