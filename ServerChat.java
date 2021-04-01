package com.hp.util;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;

public class ServerChat {
	private static CopyOnWriteArrayList<Customer> all = new CopyOnWriteArrayList<Customer> ();
	
	public static void main(String[] args) throws IOException {
		System.out.println("~~~~~~~~~~~~~服务器~~~~~~~~~~~~~");
		ServerSocket serverSocket = new ServerSocket(8800);
		
		// 阻塞监听
		while(true) {
			Socket client = serverSocket.accept();
			System.out.println("来了一个~~~~~~~");
			
			Customer c = new Customer(client);
			all.add(c);
			new Thread(c).start();
			
		}
		
		
	}
	
	// 每一个用户对象
	static class Customer implements Runnable{
		private DataInputStream dis;
		private DataOutputStream dos;
		private Socket client;
		private boolean flag;
		private String name;
		
		

		public Customer(Socket client) {
			super();
			this.client = client;
			this.flag = true;
			
			try {
				dis =  new DataInputStream(client.getInputStream());
				dos= new DataOutputStream(client.getOutputStream());
				// 获取名称
				this.name = receive();
				this.send("欢迎上线~~~~~~~"+name);
				
				
				
				
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
		
		
		// 发送消息给新用户
		public  void send(String msg) {
			
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				colosed();
			}
		}
		
		// 聊天功能
		public void sendOthers(String msg  , boolean  isSystem) {
			// 判断是否是私聊
			boolean isSiliao = msg.startsWith("@");
			
			
			if(isSiliao) {// 私聊
				int index = msg.indexOf(":");
				// 获取目标数据
				String name = msg.substring(1, index);
				
				msg = msg.substring(index+1);
				
				for (Customer o : all) {
					
					// 如果是目标对象
					if(o.name.equals(name)) {
						o.send(this.name+"和你说："+msg);
						break;
					}
				}
				
			}else {
				// 面对所有人
				for (Customer o : all) {
					
					// 如果是自己不进行操作
					if(o==this) {
						continue;
						
					}
					
					if(!isSystem) {
						// 群聊
						o.send(this.name+"和大家讲:"+msg);
						
					}else {
						// 系统消息
						o.send(msg);
						
					}
				}
				
				
				
			}
			
			
		}
		
		
		// 关闭
		public void closed() {
			
			this.flag = false;
			CloseUtil.close(dis,dos,client);
			// 退出用户
			all.remove(this);
			this.sendOthers(this.name+"走了", true);
			
		}
		
		








		@Override
		public void run() {
			while (flag) {
				String msg = receive();
				if(!msg.equals("")) {
					sendOthers(msg, false);
					
				}
			}
			
		}
		

		public void colosed() {
			
			this.flag = false;
			
			CloseUtil.close(dis,client);
		}

		
		
	};
	
	
	
}
