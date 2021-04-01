package com.hp.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Send implements Runnable {
	
	private BufferedReader  console;
	private DataOutputStream dos;
	private Socket client;
	
	
	private boolean flag;
	
	private String name;
	
	
	

	public Send(Socket client, String name) {
		super();
		this.flag = true;
		this.client = client;
		this.name = name;
		
		console = new BufferedReader(new InputStreamReader(System.in));
		// 发送名称
		send(name);
		try {
			dos= new DataOutputStream(client.getOutputStream());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.colosed();
		}
	}

	/*发送消息*/
	public void send(String msg) {
		try {
			dos.writeUTF(msg);
			dos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.colosed();
		}
		
	}


	@Override
	public void run() {
		while (flag) {
			String msg = this.getConsoleMessage();
			if(msg!=null&&!msg.equals("")) {
				send(msg);
				
			}
			
		}

	}

	/*
	 * 从控制台获取消息 
	 */
	public String getConsoleMessage() {
		try {
			return console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			colosed();
		}
		return "";
	}
	
	public void colosed() {
		
		this.flag = false;
		
		CloseUtil.close(dos,client);
	}
}
