package com.yangzhanpeng.entity;

public class Type {
	private int tid;//类型ID
	private String tname;//类型名称
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Type(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
}
