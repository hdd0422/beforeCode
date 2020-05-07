package com.ssc.shape;

public class Trapezia extends Shape // ��������
{
	private double top;
	private double bottom;
	private double height;

	public Trapezia(double top, double bottom, double height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}

	public void Area() {
		System.out.println("�������ε����:" + ((top + bottom) * height / 2));
	}

	public void Circumference() {
		System.out.println("�������ε��ܳ�:" + getCircumference());/// ********
	}

	public double getArea() {
		return (top + bottom) * height / 2;
	}

	public String toString() {
		return "ch1005_12.Trapezia[�ϵ�:" + top + "�µ�:" + bottom + ",��:" + height + ",���:" + getArea() + ",�ܳ�:"
				+ getCircumference() + "]\n";
	}

	private double getCircumference() {
		double temp = (bottom - top) / 2;
		double yao = Math.sqrt(height * height + temp * temp);
		return (top + bottom + 2 * yao);
	}
}
