package com.ssc.shape;

public abstract class Shape implements Comparable {
	public abstract void Circumference();// 周长

	public abstract void Area(); // 面积 抽象方法

	public abstract double getArea();

	public int compareTo(Object obj) {
		// this ----> obj ( 强制转换)
		Shape ele = (Shape) obj;
		if (this.getArea() > ele.getArea())
			return 1;
		else if (this.getArea() < ele.getArea())
			return -1;
		else
			return 0;
	}
}
