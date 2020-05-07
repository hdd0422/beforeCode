package com.ssc.shape;

public class Trapezia extends Shape // 等腰梯形
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
		System.out.println("等腰梯形的面积:" + ((top + bottom) * height / 2));
	}

	public void Circumference() {
		System.out.println("等腰梯形的周长:" + getCircumference());/// ********
	}

	public double getArea() {
		return (top + bottom) * height / 2;
	}

	public String toString() {
		return "ch1005_12.Trapezia[上底:" + top + "下底:" + bottom + ",高:" + height + ",面积:" + getArea() + ",周长:"
				+ getCircumference() + "]\n";
	}

	private double getCircumference() {
		double temp = (bottom - top) / 2;
		double yao = Math.sqrt(height * height + temp * temp);
		return (top + bottom + 2 * yao);
	}
}
