package com.ssc.shape;

public class RightAngledRritangle extends Shape {
	private double a;
	private double b;

	public RightAngledRritangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void Circumference() {
		double c = Math.sqrt(a * a + b * b);
		System.out.println("ֱ�������ε��ܳ���" + (a + b + c));
	}

	public void Area() {
		System.out.println("ֱ�������ε������" + (a * b / 2));
	}

	public double getArea() {
		return (a * b / 2);
	}

	public String toString() {
		return "ch1005_12.RightAngledRritangle[ֱ�Ǳ߳�:" + a + "," + b + ",���:" + getArea() + ",�ܳ�:"
				+ (a + b + Math.sqrt(a * a + b * b)) + "]\n";
	}

}
