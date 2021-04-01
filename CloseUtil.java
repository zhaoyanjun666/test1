package com.hp.util;

import java.io.Closeable;
import java.io.IOException;

public class CloseUtil {
	// 可变参数列表
	/*
	 * public void test(String... str) {
	 * 
	 * 
	 * }
	 * 
	 * public void test1() {
	 * 
	 * test(new String[5]); }
	 */
	
	
	
	
	
	
	
	
	
  public static void close(Closeable... targets) {
	  
	  for (Closeable target : targets) {
		  if(target!=null) {
			  try {
				target.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				target=null;
			}
			  
		  }
	  }
	  
  }
  
}
