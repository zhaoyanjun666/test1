package com.hp.bean;

public class Account {
	
	private int blance = 500;
	// ��ȡ���
	public int getCurrentBlance(){
		return blance;
	}
	// ȡǮ
	public void withDraw(int money){
		blance = blance-money;
		
	}
	
	
	
	public int getBlance() {
		return blance;
	}
	public void setBlance(int blance) {
		this.blance = blance;
	}

}
