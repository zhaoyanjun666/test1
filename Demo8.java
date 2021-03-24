package com.hp.demo;

public class Demo8 {
	public static void main(String[] args) {
		/* 逻辑运算符 : && 、 || 、！、&、|
		 * &&：与   左右两边都为true，结果为true，只要有一边不成立结果就为fasle；
		 * ||: 或  左右两边只要有一边成立结果就为true；
		 * ！： 非（取反）
		 * &：  单与
		 * |:  单或
		 */
		int  a = 10 ;
		int b = 3;
		int c = 123;
		int d = 23;
		
		boolean result = b<a && d>c;
		System.out.println(result);
		
		System.out.println(!result);
		
		result = b>a || d>c;
		System.out.println(result);
		
		
	}
}
