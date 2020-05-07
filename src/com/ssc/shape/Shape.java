package com.ssc.shape;

public abstract class Shape implements Comparable {
	public abstract void Circumference();// �ܳ�

	public abstract void Area(); // ��� ���󷽷�

	public abstract double getArea();

	public int compareTo(Object obj) {
		// this ----> obj ( ǿ��ת��)
		Shape ele = (Shape) obj;
		if (this.getArea() > ele.getArea())
			return 1;
		else if (this.getArea() < ele.getArea())
			return -1;
		else
			return 0;
	}
}
