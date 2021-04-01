package com.hp.util;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receive implements Runnable{
	private DataInputStream dis;
	
	private Socket client;
	
	private boolean flag;
	
	public Receive(Socket client) {
		super();
		this.flag = true;
		this.client = client;
		try {
			dis =  new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			colosed();
		}
	}

	
	public String receive() {
		String msg = "";
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			colosed();
		}
		
		return msg;
	}
	

	





	@Override
	public void run() {
		while (flag) {
			String msg = this.receive();
			if(!msg.equals("")) {
				System.out.println(msg);
				
			}
			
			
		}
	}
	
	
	public void colosed() {
		
		this.flag = false;
		
		CloseUtil.close(dis,client);
	}

}
