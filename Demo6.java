package com.hp.demo;

public class Demo6 {
	public static void main(String[] args) {
		/*  运算符
		 *  1. 算数运算符：+ 、 - 、 * 、 / 、% 、 ++ 、--
		 * 
		 */
		int a = 10 ;
		int b = 3;
		/*int c = a%b;
		
		System.out.println(0%0.0);
		System.out.println(c);
		*/
		//++ 自增运算符  
		//++在后，先用后加
		/*System.out.println(a++);   // 先输出a， 再执行 a = a+1
	
		
		System.out.println(a);*/
		//++在前，先加后用
		System.out.println(++a); // 先执行a=a+1 ， 再输出a
		System.out.println(a);
		
	
		System.out.println(b+++2);
		System.out.println(b);
		
	
		System.out.println(b+++2);
		System.out.println(b);
		
	}	
}
