package com.hp.demo;

public class Demo7 {
	public static void main(String[] args) {
		// 2. ��ϵ�����(�Ƚ������) : == ��> ��< �� >= �� <=
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
