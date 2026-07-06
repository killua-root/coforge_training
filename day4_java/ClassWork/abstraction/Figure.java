package com.coforge.day4.abstraction;

public abstract class Figure implements Areaplan{
	private int l;
	private int b;
	private int a;
	private long ba;
	private long h;
	
	public Figure(int l, int b) {
		this.l = l;
		this.b = b;
	}
	
	public Figure(int a) {
		this.a = a;
	}
	
	public Figure(long ba, long h) {
		this.ba =ba;
		this.h = h;
	}
	
	public abstract void area();

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public long getBa() {
		return ba;
	}

	public void setBa(long ba) {
		this.ba = ba;
	}

	public long getH() {
		return h;
	}

	public void setH(long h) {
		this.h = h;
	}
	
	
	
}
