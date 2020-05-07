package com.ssc.shape;

public class Circle extends Shape {
	private double _r;

	// ���󷽷� ��ʵ��
	public void Area() {
		System.out.println(" Բ�����: " + (_r * _r * 3.1415926));
	}

	public void Circumference() {
		System.out.println(" Բ���ܳ�: " + (2 * _r * 3.1415926));
	}

	public double getArea() {
		return _r * _r * 3.1415926;
	}

	public String toString() {
		return "ch1005_12.Circle[�뾶:" + _r + ",���:" + getArea() + ",�ܳ�:" + (2 * _r * 3.1415926) + "]\n";
	}

	public Circle(double _r) {
		this._r = _r;
	}

	public double get_r() {
		return _r;
	}

	public void set_r(double _r) {
		this._r = _r;
	}

}
