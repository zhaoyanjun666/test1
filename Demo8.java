package com.hp.demo;

public class Demo8 {
	public static void main(String[] args) {
		/* �߼������ : && �� || ������&��|
		 * &&����   �������߶�Ϊtrue�����Ϊtrue��ֻҪ��һ�߲����������Ϊfasle��
		 * ||: ��  ��������ֻҪ��һ�߳��������Ϊtrue��
		 * ���� �ǣ�ȡ����
		 * &��  ����
		 * |:  ����
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
