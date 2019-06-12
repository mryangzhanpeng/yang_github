package com.yangzhanpeng.entity;

public class Movie {
	private int mid;//影片ID
	private String mname;//影片名
	private String mauthor;//导演
	private double mprice;//票价
	private String mdate;//上映时间
	private int mtime;//时长
	private int tid;//类型名称
	private int myear;//年代
	private String maddr;//区域
	private int stats;//状态
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMauthor() {
		return mauthor;
	}
	public void setMauthor(String mauthor) {
		this.mauthor = mauthor;
	}
	public double getMprice() {
		return mprice;
	}
	public void setMprice(double mprice) {
		this.mprice = mprice;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	public int getMtime() {
		return mtime;
	}
	public void setMtime(int mtime) {
		this.mtime = mtime;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getMyear() {
		return myear;
	}
	public void setMyear(int myear) {
		this.myear = myear;
	}
	public String getMaddr() {
		return maddr;
	}
	public void setMaddr(String maddr) {
		this.maddr = maddr;
	}
	public int getStats() {
		return stats;
	}
	public void setStats(int stats) {
		this.stats = stats;
	}
	public Movie(int mid, String mname, String mauthor, double mprice, String mdate, int mtime, int tid, int myear,
			String maddr, int stats) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mauthor = mauthor;
		this.mprice = mprice;
		this.mdate = mdate;
		this.mtime = mtime;
		this.tid = tid;
		this.myear = myear;
		this.maddr = maddr;
		this.stats = stats;
	}
	public Movie(String mname, String mauthor, double mprice, String mdate, int mtime, int tid, int myear, String maddr,
			int stats) {
		super();
		this.mname = mname;
		this.mauthor = mauthor;
		this.mprice = mprice;
		this.mdate = mdate;
		this.mtime = mtime;
		this.tid = tid;
		this.myear = myear;
		this.maddr = maddr;
		this.stats = stats;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mauthor=" + mauthor + ", mprice=" + mprice + ", mdate="
				+ mdate + ", mtime=" + mtime + ", tid=" + tid + ", myear=" + myear + ", maddr=" + maddr + ", stats="
				+ stats + "]";
	}
	
	
}
