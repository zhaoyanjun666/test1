package com.hp.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import com.hp.util.Receive;
import com.hp.util.Send;

public class Client {
	public static void main(String[] args) throws IOException {
		System.out.println("~~~~~~~~~客户端~~~~~~~~");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入用户名");
		
		String name = reader.readLine();
		
		Socket client = new Socket("localhost",8800);
		
		new Thread(new Send(client, name)).start();
		
		new Thread(new Receive(client)).start();
		
	}
}
