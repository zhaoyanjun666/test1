package com.hp.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*int a = aaa();
		System.out.println(a);*/
		
		try {
			function();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static  int aaa(){
		
		System.out.println("���������");
		Integer num1 = input.nextInt();
		
		
			try {
				System.out.println("�����뱻����");
				Integer num2 = input.nextInt();
				
				System.out.println(num1+"/"+num2+"="+num1/num2);
				System.out.println(String.format("%d/%d=%d", num1,num2,(num1/num2)));
				System.exit(0);
				return 0;
			} catch (ArithmeticException e) {
				System.out.println("������������������");
				/*String message = e.getMessage();
				System.out.println(message);
				e.printStackTrace();*/
				return 1;
				
			}catch(InputMismatchException e){
				System.out.println("�������");
				return 1;
				
			}catch(Exception e){
				System.out.println("�Ҳ�֪��Ϊɶ��������");
				return 1;
			}finally{
				
				System.out.println("The End��");
				return 2;
			}
		
		//ArithmeticException e
		//InputMismatchException
		
	}
	
	public static void function() throws IndexOutOfBoundsException,Exception{
		int[] a = {12,22,33};
		
			System.out.println(a[3]);	
		
	}
	
	public static void function1() throws MyException {
		System.out.println("�������Ա�");
		String sex = input.next();
		if(!sex.equals("��")&&!sex.equals("Ů")){
			throw new MyException();
			
		}
		
	}
	
	
}
